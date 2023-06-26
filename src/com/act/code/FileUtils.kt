package com.act.code

import com.act.code.Config.layoutList
import com.act.code.tools.GenerateFileTools
import com.act.code.tools.generateDeclareObjectKey
import com.act.code.generate.GenerateActivityFun
import com.act.code.generate.GenerateLayoutFun
import com.act.code.tools.generateFunName
import com.act.code.tools.generateLayoutId
import java.io.File

object FileUtils {


    /**
     *     val filePath = "com.cn.javass"
     *         val fileName = "/Builder${generateFunName()}.java"
     */
    public val listPackage = LinkedHashSet<String>()

    fun generateFile(packageValue: String, fileName: String, action: (String, File) -> File) {
        val filePath = "./" + packageValue.replace(".", "/")
        GenerateFileTools.generateFile(filePath, fileName)
        val file = File("$filePath/$fileName")
        action(packageValue, file)
    }




    fun initFileContent(packagePath: String, file: File): File {
        val fileFunList = mutableListOf<Map<String, MutableList<String>>>()
        listPackage.clear()
        repeat((Config.packageSize..2 * Config.packageSize).random()) {
            fileFunList.add(GenerateFileTools.generateFunAction())
        }
        val listFun = mutableListOf<String>()
        fileFunList.forEach { map ->
            map.forEach { entry ->
                listFun.add(entry.key)
            }
        }
        val buffer = StringBuffer()
        buffer.append("package $packagePath;\n")
        buffer.append("\n")
        listPackage.forEach {
            buffer.append("$it\n")
        }

        buffer.append("\n")
        buffer.append("\n")
        buffer.append("public class ${file.name.split(".")[0]}{\n")

        buffer.append("\n")

        repeat((listFun.size) / 4) {
            buffer.append(declareStaticValueString()).append("")
        }

        repeat(listFun.size) {
            buffer.append(declareValueString()).append("\n")
        }
        buffer.append("\n")

        // 所有方法的调用
        buffer.append("public  ${file.name.split(".")[0]}(){")
        buffer.append("\n")
        listFun.forEach {
            buffer.append("$it").append("\n")
        }
        buffer.append("}")

        // 所有方法的内容
        buffer.append("\n")
        fileFunList.forEach { map ->
            map.forEach { entry ->
                val value = entry.value
                value.forEach {
                    buffer.append(it).append("\n")
                }
            }
            buffer.append("\n")
        }
        buffer.append("\n")
        buffer.append("}")
        buffer.append("\n")

        file.writeText(buffer.toString())
        return file

    }

    // 获取所有的class 列表
    private fun getListClassObject(): List<String> {
        val list = mutableListOf<String>()
        Config.normalClassMap.forEach { map ->
            map.value.forEach {
                list.add(map.key + "->" + it)
            }
        }
        return list
    }


    fun initActivityContent(packagePath: String, file: File): File {
        val listClassObject = getListClassObject()
        val fileFunList = mutableListOf<Map<String, MutableList<String>>>()
        listPackage.clear()

        val importClassList = mutableListOf<String>()  // 引入的class 类对象
        repeat(listClassObject.size / 8) {
            val classObject = listClassObject.random()
            if (!importClassList.contains(classObject)) {
                importClassList.add(classObject)
            }
        }
        importClassList.forEach {
            val classArray = it.split("->")
            listPackage.add("import ${classArray[0]}.${classArray[1].split(".")[0]};")
        }

        // 生成所非方法
        repeat((Config.packageSize..2 * Config.packageSize).random()) {
            fileFunList.add(GenerateFileTools.generateFunAction())
        }

        // 所有方法的使用集合
        val listFun = mutableListOf<String>()
        fileFunList.forEach { map ->
            map.forEach { entry ->
                listFun.add(entry.key)
            }
        }

        // 生成activity 的原生方法
        val listOriginActFun = mutableListOf<String>().apply {
            addAll(GenerateActivityFun.generateActOnCreate())
            addAll(GenerateActivityFun.generateActOnBackPress())
            addAll(GenerateActivityFun.generateActOnConfigurationChanged())
            addAll(GenerateActivityFun.generateActOnNewIntent(importClassList))
            addAll(GenerateActivityFun.generateActOonRestoreInstanceState())
            addAll(GenerateActivityFun.generateActOnStart())
            addAll(GenerateActivityFun.generateActOnRestart())
        }

        val buffer = StringBuffer()
        buffer.append("package $packagePath;\n")
        buffer.append("\n")
        listPackage.forEach {
            buffer.append("$it\n")
        }

        buffer.append("\n")
        buffer.append("\n")
        buffer.append("public class ${file.name.split(".")[0]} extends Activity {\n")

        buffer.append("\n")

        // 添加头部的静态对象方法
        repeat((listFun.size) / 4) {
            buffer.append(declareStaticValueString()).append("")
        }

        // 添加非静态对象的方法
        repeat(listFun.size) {
            buffer.append(declareValueString()).append("\n")
        }
        buffer.append("\n")

        // 所有方法的调用
        buffer.append("public  ${file.name.split(".")[0]}(){")
        buffer.append("\n")
        listFun.forEach {
            buffer.append("$it").append("\n")
        }
        buffer.append("}")

        // 所有方法的内容
        buffer.append("\n")
        fileFunList.forEach { map ->
            map.forEach { entry ->
                val value = entry.value
                value.forEach {
                    buffer.append(it).append("\n")
                }
            }
            buffer.append("\n")
        }

        listOriginActFun.forEach {
            buffer.append(it + "\n")
        }


        buffer.append("\n")
        buffer.append("}")
        buffer.append("\n")

        file.writeText(buffer.toString())
        return file

    }


    private fun declareValueString(): String {
        return when ((0..7).random()) {
            0 -> "public int ${generateDeclareObjectKey()} = ${(0..50000).random()};"
            1 -> {
                val buffer = StringBuffer()
                buffer.append("public int[] ${generateDeclareObjectKey()} = {")
                repeat((10..50).random()) {
                    buffer.append((0..9999).random()).append(",")
                }
                buffer.append("};")
                buffer.toString()
            }

            2 -> "private String  ${generateDeclareObjectKey()} = \" ${generateDeclareObjectKey(40)}\";"
            3 -> {
                val buffer = StringBuffer()
                buffer.append("public String[] ${generateDeclareObjectKey()} = {")
                repeat((10..50).random()) {
                    buffer.append("\"${generateDeclareObjectKey((4..30).random())}\",")
                }
                buffer.append("};")
                buffer.toString()
            }

            4 -> "private boolean ${generateDeclareObjectKey()} = true;"
            5 -> "private double  ${generateDeclareObjectKey()} =  ${(0..50000).random()}.0d;"
            6 -> {
                val buffer = StringBuffer()
                buffer.append("public double[] ${generateDeclareObjectKey()} = {")
                repeat((10..50).random()) {
                    buffer.append((0..9999).random()).append("d,")
                }
                buffer.append("};")
                buffer.toString()
            }

            else -> ""
        }
    }

    private fun declareStaticValueString(): String {
        return when ((0..3).random()) {
            0 -> {
                val buffer = StringBuffer()
                buffer.append("public static final double[] ${generateDeclareObjectKey()} = {")
                repeat((10..50).random()) {
                    buffer.append((0..9999).random()).append("d,")
                }
                buffer.append("};")
                buffer.toString()
            }

            1 -> {
                val buffer = StringBuffer()
                buffer.append("public static final String[] ${generateDeclareObjectKey()} = {")
                repeat((10..50).random()) {
                    buffer.append("\"${generateDeclareObjectKey((4..30).random())}\",")
                }
                buffer.append("};")
                buffer.toString()
            }

            2 -> {
                val buffer = StringBuffer()
                buffer.append("public static final int[] ${generateDeclareObjectKey()} = {")
                repeat((10..50).random()) {
                    buffer.append((0..9999).random()).append(",")
                }
                buffer.append("};")
                buffer.toString()
            }

            else -> ""

        }
    }

    fun generateLayoutFile(): String {
        val filePath = "./src/layout"
        val fileName = "activity_${generateLayoutId()}.xml"
        if (GenerateFileTools.generateFile(filePath, fileName)){
            val file = File("$filePath/$fileName")
            layoutList.add(fileName)
            val s = if ((0..1).random() == 1) {
                GenerateLayoutFun.generateRelativeLayoutView()
            } else {
                GenerateLayoutFun.generateLinerLayoutView()
            }
            file.writeText(s)
        }
        return fileName.split(".")[0]

    }


}
