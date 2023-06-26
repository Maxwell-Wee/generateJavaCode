package com.act.code.tools

import com.act.code.generate.*
import java.io.File
import java.lang.Exception

object GenerateFileTools {
    // 创建文件
    fun generateFile(filePath: String, fileName: String): Boolean {
        try {
            val fp = File(filePath)
            fp.mkdirs()
            val file = File("$filePath/$fileName")
            if (!file.exists()) {
                file.createNewFile()
            }
            file.createNewFile()
            return true
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
    }

    // 随机获取其中的一个方法
    fun generateFunAction(): HashMap<String, MutableList<String>> {
        return when ((0..34).random()) {
            0 -> GenerateBooleanFun.generateBooleanFun()
            1 -> GenerateBooleanFun.generateBooleanFun2()
            2 -> GenerateBooleanFun.generateBooleanFun3()

            3 -> GenerateDoubleFun.generateDoubleFun()
            4 -> GenerateDoubleFun.generateDoubleFun2()

            5 -> GenerateIntFun.generateIntFun()
            6 -> GenerateIntFun.generateIntFun2()
            7 -> GenerateIntFun.generateIntFun3()
            8 -> GenerateIntFun.generateIntFun4()
            9 -> GenerateIntFun.generateIntFun5()
            10 -> GenerateIntFun.generateIntFun6()
            11 -> GenerateIntFun.generateIntFun7()
            12 -> GenerateIntFun.generateIntFun8()
            13 -> GenerateIntFun.generateIntFun9()
            14 -> GenerateIntFun.generateIntFun10()
            15 -> GenerateIntFun.generateIntFun11()
            16 -> GenerateIntFun.generateIntFun12()

            17 -> GenerateStringFun.generateStringFun()
            18 -> GenerateStringFun.generateStringFun2()
            19 -> GenerateStringFun.generateStringFun3()
            20 -> GenerateStringFun.generateStringFun4()
            21 -> GenerateStringFun.generateStringFun5()
            22 -> GenerateStringFun.generateStringFun6()
            23 -> GenerateStringFun.generateStringFun7()
            24 -> GenerateStringFun.generateStringFun8()
            25 -> GenerateStringFun.generateStringFun9()
            26 -> GenerateStringFun.generateStringFun10()

            27 -> GenerateVoidFun.generateVoidFun()
            28 -> GenerateVoidFun.generateVoidFun2()
            29 -> GenerateVoidFun.generateVoidFun3()

            30 -> GenerateIntFun.generateIntFun13()
            31 -> GenerateBooleanFun.generateBooleanFun4()
            32 -> GenerateStringFun.generateStringFun11()
            33 -> GenerateStringFun.generateStringFun12()

            else -> GenerateVoidFun.generateVoidFun4()
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {

        repeat(34){
            val map = generate(it)
            println("=======================")
            map.forEach {map2->
                map2.value.forEach { str ->
                    println(str)
                }
            }


        }


    }

    fun generate(status :Int): HashMap<String, MutableList<String>> {
        return when (status) {
            0 -> GenerateBooleanFun.generateBooleanFun()
            1 -> GenerateBooleanFun.generateBooleanFun2()
            2 -> GenerateBooleanFun.generateBooleanFun3()

            3 -> GenerateDoubleFun.generateDoubleFun()
            4 -> GenerateDoubleFun.generateDoubleFun2()

            5 -> GenerateIntFun.generateIntFun()
            6 -> GenerateIntFun.generateIntFun2()
            7 -> GenerateIntFun.generateIntFun3()
            8 -> GenerateIntFun.generateIntFun4()
            9 -> GenerateIntFun.generateIntFun5()
            10 -> GenerateIntFun.generateIntFun6()
            11 -> GenerateIntFun.generateIntFun7()
            12 -> GenerateIntFun.generateIntFun8()
            13 -> GenerateIntFun.generateIntFun9()
            14 -> GenerateIntFun.generateIntFun10()
            15 -> GenerateIntFun.generateIntFun11()
            16 -> GenerateIntFun.generateIntFun12()

            17 -> GenerateStringFun.generateStringFun()
            18 -> GenerateStringFun.generateStringFun2()
            19 -> GenerateStringFun.generateStringFun3()
            20 -> GenerateStringFun.generateStringFun4()
            21 -> GenerateStringFun.generateStringFun5()
            22 -> GenerateStringFun.generateStringFun6()
            23 -> GenerateStringFun.generateStringFun7()
            24 -> GenerateStringFun.generateStringFun8()
            25 -> GenerateStringFun.generateStringFun9()
            26 -> GenerateStringFun.generateStringFun10()

            27 -> GenerateVoidFun.generateVoidFun()
            28 -> GenerateVoidFun.generateVoidFun2()
            29 -> GenerateVoidFun.generateVoidFun3()

            30 -> GenerateIntFun.generateIntFun13()
            31 -> GenerateBooleanFun.generateBooleanFun4()
            32 -> GenerateStringFun.generateStringFun11()
            33 -> GenerateStringFun.generateStringFun12()

            else -> GenerateVoidFun.generateVoidFun4()
        }
    }

}