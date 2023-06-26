package com.act.code.generate

import com.act.code.FileUtils
import com.act.code.tools.generateClassKey
import com.act.code.tools.generateFunName
import com.act.code.tools.redRandomChar
import kotlin.collections.HashMap

object GenerateStringFun {


    fun generateStringFun(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private static String ${stringFunName}(String str) {")
            add("if (str == null || str.length() == 0) {")
            add("return \"\";")
            add("}")
            add("char[] charArray = str.toCharArray();")
            add("int length = charArray.length;")
            add("for (int i = 0; i < length; i++) {")
            add(" if (charArray[i] == ' ') {")
            add("charArray[i] = ${(10000..20000).random()};")
            add("} else if ('!' > charArray[i] || charArray[i] > '~') {")
            add("charArray[i] = charArray[i];")
            add("} else {")
            add("charArray[i] = (char) (charArray[i] + ${(10000..20000).random()});")
            add("}")
            add("}")
            add("return new String(charArray);")
            add("}")
        }
        val funName = stringFunName + "(\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }

    fun generateStringFun2(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static String ${stringFunName}(String str) {")
            add("if (str == null) {")
            add("return \"\";")
            add("}")
            add("int length = str.length();")
            add("if (length <= 1) {")
            add("return str;")
            add("}")
            add("int i = length >> 1;")
            add("char[] charArray = str.toCharArray();")
            add("for (int i2 = 0; i2 < i; i2++) {")
            add("char c = charArray[i2];")
            add("int i3 = (length - i2) - 1;")
            add("charArray[i2] = charArray[i3];")
            add("charArray[i3] = c;")
            add("}")
            add("return new String(charArray);")
            add("}")
        }
        val funName = stringFunName + "(\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }


    fun generateStringFun3(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private static String ${stringFunName}(String str, String str2, String str3) {")
            add("if (str == null) {")
            add(" return null;")
            add("}")
            add("String lowerCase = str.toLowerCase();")
            add("String lowerCase2 = str2.toLowerCase();")
            add("int indexOf = lowerCase.indexOf(lowerCase2, 0);")
            add("if (indexOf < 0) {")
            add("return str;")
            add("}")
            add("char[] charArray = str.toCharArray();")
            add("char[] charArray2 = str3.toCharArray();")
            add("int length = str2.length();")
            add("StringBuffer stringBuffer = new StringBuffer(charArray.length);")
            add("stringBuffer.append(charArray, 0, indexOf);")
            add("stringBuffer.append(charArray2);")
            add("int i = indexOf + length;")
            add("while (true) {")
            add("int indexOf2 = lowerCase.indexOf(lowerCase2, i);")
            add("if (indexOf2 > 0) {")
            add("stringBuffer.append(charArray, i, indexOf2 - i);")
            add("stringBuffer.append(charArray2);")
            add("i = indexOf2 + length;")
            add("} else {")
            add("stringBuffer.append(charArray, i, charArray.length - i);")
            add("return stringBuffer.toString();")
            add("}")
            add("}")
            add("}")
        }
        val funName = stringFunName + "(\"${generateClassKey()}\",\"${generateClassKey()}\",\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }


    fun generateStringFun4(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private String ${stringFunName}(int i) {")
            add("Calendar instance = Calendar.getInstance();")
            add("instance.setTime(new Date());")
            add("instance.add(${(3..5).random()}, i);")
            add("int i2 = instance.get(7);")
            add("return i2 == 1 ? \"${generateClassKey()}\" : i2 == 2 ? \"${generateClassKey()}\" : i2 == 3 ? \"${generateClassKey()}\" : \"${generateClassKey()}\"  ;")
            add("}")

        }
        FileUtils.listPackage.add("import java.util.Date;")
        FileUtils.listPackage.add("import java.util.Calendar;")
        val funName = stringFunName + "(${(1000..2000).random()});"
        map[funName] = mutableList
        return map
    }


    fun generateStringFun5(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private String ${stringFunName}(String str) {")
            add("String str2 = str.split(\"-\")[0];")
            add("String str3 = str.split(\"-\")[1];")
            add("String str4 = str.split(\"-\")[2];")
            add("Calendar instance = Calendar.getInstance();")
            add("instance.set(1, Integer.parseInt(str2));")
            add("instance.set(2, Integer.parseInt(str3) - 1);")
            add("instance.set(${(3..5).random()}, Integer.parseInt(str4));")
            add("switch (instance.get(7)) {")
            repeat(5) {
                add("case ${it}:")
                add("return \"${generateClassKey(20)}\";")
            }
            add("default:")
            add("return \"\";")
            add("}")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Date;")
        FileUtils.listPackage.add("import java.util.Calendar;")
        val funName = stringFunName + "(\"${generateClassKey(40)}\");"
        map[funName] = mutableList
        return map
    }


    fun generateStringFun6(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public String ${stringFunName}() {")
            add("SimpleDateFormat simpleDateFormat = new SimpleDateFormat(\"yyyy-MM-dd\");")
            add("Calendar instance = Calendar.getInstance();")
            repeat((2..5).random()) {
                add("instance.add(${(1..5).random()}, ${(0..3).random()});")
            }
            add("return simpleDateFormat.format(instance.getTime());")
            add("}")
        }
        FileUtils.listPackage.add("import java.text.SimpleDateFormat;")
        FileUtils.listPackage.add("import java.util.Date;")
        FileUtils.listPackage.add("import java.util.Calendar;")
        val funName = "$stringFunName();"
        map[funName] = mutableList
        return map
    }


    fun generateStringFun7(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static String ${stringFunName}(long j, String str) {")
            add("return new SimpleDateFormat(str).format(Long.valueOf(j));")
            add("}")
        }
        FileUtils.listPackage.add("import java.text.SimpleDateFormat;")
        val funName = "$stringFunName(${System.currentTimeMillis()}L,\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }

    fun generateStringFun8(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public String  ${stringFunName}() {")
            add("SimpleDateFormat simpleDateFormat = new SimpleDateFormat(\"yyyy-MM-dd\");")
            add("Calendar instance = Calendar.getInstance();")
            repeat((1..4).random()) {
                add("instance.add(${(1..3).random()}, ${(0..2).random()});")
            }
            add("return simpleDateFormat.format(instance.getTime());")
            add("}")
        }
        FileUtils.listPackage.add("import java.text.SimpleDateFormat;")
        FileUtils.listPackage.add("import java.util.Date;")
        FileUtils.listPackage.add("import java.util.Calendar;")
        val funName = "$stringFunName();"
        map[funName] = mutableList
        return map
    }


    fun generateStringFun9(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public String ${stringFunName}(double d) {")
            add("return new DecimalFormat(\"##0.0\").format(d / 10000.0d);")
            add("}")
        }
        FileUtils.listPackage.add("import java.text.DecimalFormat;")
        val funName = "$stringFunName(${(200000..400000).random() * 1.0 / 10});"
        map[funName] = mutableList
        return map
    }

    fun generateStringFun10(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public String ${stringFunName}(String str) {")
            add("return Pattern.compile(\"[^a-zA-Z0-9]\").matcher(str).replaceAll(\"\").trim();")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.regex.Pattern;")
        val funName = "$stringFunName(\"${System.currentTimeMillis()}\");"
        map[funName] = mutableList
        return map
    }


    fun generateStringFun11(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static String[] ${stringFunName}(String str, String str2) {")
            add("if (str == null) { return null; }")
            add("try {")
            add("StringTokenizer stringTokenizer = new StringTokenizer(str, str2);")
            add("String[] strArr = new String[stringTokenizer.countTokens()];")
            add("int i = 0;")
            add("while (stringTokenizer.hasMoreTokens()) {")
            add("String nextToken = stringTokenizer.nextToken();")
            add("if (!(nextToken == null || nextToken.trim().length() == 0)) {")
            add("i++;")
            add("strArr[i] = nextToken;")
            add("}}")
            add("return strArr;")
            add("} catch (Exception unused) {")
            add("return null;")
            add("}")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.StringTokenizer;")
        val funName = "$stringFunName(\"${generateFunName()}\",\"${generateFunName()}\");"
        map[funName] = mutableList
        return map
    }

    fun generateStringFun12(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static String ${stringFunName}(String str, char c, char c2) { return str.length() > 0 ? str.replace(c, c2) : str;}")
        }
        val funName = "$stringFunName(\"${generateFunName()}\",\'${redRandomChar()}\','${redRandomChar()}');"
        map[funName] = mutableList
        return map
    }


}