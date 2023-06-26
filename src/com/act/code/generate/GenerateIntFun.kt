package com.act.code.generate

import com.act.code.FileUtils
import com.act.code.tools.generateFunName

object GenerateIntFun {

    fun generateIntFun(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private int ${stringFunName}(long j, long j2) {")
            add("Calendar instance = Calendar.getInstance();")
            add("Calendar instance2 = Calendar.getInstance();")
            add("instance.setTime(new Date(j));")
            add(" instance2.setTime(new Date(j2));")
            add("int i = instance.get(1);")
            add("int i2 = instance2.get(1);")
            add("if (i == i2) {")
            add("return Math.abs(instance.get(2) - instance2.get(2));")
            add("}")
            add("return (Math.abs((i2 - i) - 1) * 12) + (12 - (instance.get(2) + 1)) + instance2.get(2) + 1;")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Calendar;")
        FileUtils.listPackage.add("import java.util.Date;")

        val funName = "$stringFunName( ${(1000..2000).random()}L, ${(1000..2000).random()}L);"
        map[funName] = mutableList
        return map
    }

    fun generateIntFun2(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private int ${stringFunName}(long j, long j2) {")
            add("Calendar instance = Calendar.getInstance();")
            add("Calendar instance2 = Calendar.getInstance();")
            add("instance.setTime(new Date(j));")
            add(" instance2.setTime(new Date(j2));")
            add("int i = instance.get(1);")
            add("int i2 = instance2.get(1);")
            add("if (i == i2) {")
            add("return Math.abs(instance.get(2) - instance2.get(2));")
            add("}")
            add("return (Math.abs((i2 - i) - 1) * 12) + (12 - (instance.get(2) + 1)) + instance2.get(2) + 1;")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Calendar;")
        FileUtils.listPackage.add("import java.util.Date;")
        val funName = "$stringFunName( ${(1000..2000).random()}L, ${(1000..2000).random()}L);"
        map[funName] = mutableList
        return map
    }

    fun generateIntFun3(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private int ${stringFunName}(long j) {")
            add("Calendar instance = Calendar.getInstance();")
            add("instance.setTime(new Date(System.currentTimeMillis()));")
            add("instance.set(11, instance.getMinimum(11));")
            add("instance.set(12, instance.getMinimum(12));")
            add("instance.set(12, instance.getMinimum(13));")
            add("instance.set(12, instance.getMinimum(14));")
            add("Calendar instance2 = Calendar.getInstance();")
            add("instance2.setTime(new Date(j));")
            add("instance2.set(11, instance2.getMinimum(11));")
            add("instance2.set(12, instance2.getMinimum(12));")
            add("instance2.set(13, instance2.getMinimum(13));")
            add("instance2.set(14, instance2.getMinimum(14));")
            add("return (int) ((instance2.getTime().getTime() - instance.getTime().getTime()) / 86400000);")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Calendar;")
        FileUtils.listPackage.add("import java.util.Date;")
        val funName = "$stringFunName(${(2000..40900).random()}L);"
        map[funName] = mutableList
        return map
    }

    fun generateIntFun4(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static int ${stringFunName}(int[] iArr, int i) {")
            add("int length = iArr.length - 1;")
            add("int i2 = 0;")
            add("while (iArr[i2] < iArr[length]) {")
            add("int i3 = (i2 + length) / 2;")
            add("if (i > iArr[i3]) {")
            add("i2 = i3 + 1;")
            add("} else if (i >= iArr[i3]) {")
            add("return i3;")
            add("} else {")
            add("length = i3 - 1;")
            add("}")
            add("if (i2 < iArr.length) {")
            add(" if (length < 0) {")
            add("}")
            add("}")
            add("return -1;")
            add("}")
            add("return -1;")
            add("}")
        }

        val buffer = StringBuffer().apply {
            append("$stringFunName(")
            append("new int[]{")
            repeat((10..40).random()) {
                append("${(1000..5000).random()},")
            }
            append("}")
            append(",${(1000..5000).random()}")
            append(");")
        }


        val funName = buffer.toString()
        map[funName] = mutableList
        return map
    }

    fun generateIntFun5(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private int ${stringFunName}(String str, String str2) {")
            add("int i = 0;")
            add("int i2 = 0;")
            add("while (true) {")
            add("int indexOf = str.indexOf(str2, i);")
            add("if (indexOf < 0) {")
            add("return i2;")
            add("}")
            add("i2++;")
            add("i = indexOf + str2.length();")
            add("}")
            add("}")
        }
        val funName = "$stringFunName(\"${generateFunName()}\",\"${generateFunName()}\");"
        map[funName] = mutableList
        return map
    }

    fun generateIntFun6(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public int ${stringFunName}(double[] dArr) {")
            add("int i = 0;")
            add("for (int i2 = 0; i2 < dArr.length; i2++) {")
            add("if (dArr[i] > dArr[i2]) {")
            add("i = i2;")
            add("}")
            add("}")
            add("return i;")
            add("")
            add("}")
        }
        val buffer = StringBuffer().apply {
            append("$stringFunName(")
            append("new double[]{")
            repeat((10..40).random()) {
                append("${(1000..5000).random()}.0d,")
            }
            append("}")
            append(");")
        }
        val funName = buffer.toString()
        map[funName] = mutableList
        return map
    }

    fun generateIntFun7(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static int[] ${stringFunName}(int[] iArr) {")
            add("int length = iArr.length;")
            add("while (true) {")
            add("length /= 2;")
            add("if (length < 1) {")
            add("return iArr;")
            add("}")
            add("for (int i = length; i < iArr.length; i++) {")
            add("int i2 = iArr[i];")
            add("int i3 = i - length;")
            add("while (i3 >= 0 && i2 < iArr[i3]) {")
            add("iArr[i3 + length] = iArr[i3];")
            add("i3 -= length;")
            add("}")
            add("iArr[i3 + length] = i2;")
            add("}")
            add("}")
            add("}")
        }
        val buffer = StringBuffer().apply {
            append("$stringFunName(")
            append("new int[]{")
            repeat((10..40).random()) {
                append("${(1000..5000).random()},")
            }
            append("}")
            append(");")
        }
        val funName = buffer.toString()
        map[funName] = mutableList
        return map
    }

    fun generateIntFun8(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static int[] ${stringFunName}() {")
            val buffer = StringBuffer()
            buffer.append("int[] iArr = {")
            repeat((16..30).random()) {
                buffer.append("${(1000..5000).random()},")
            }
            buffer.append("};")
            add(buffer.toString())
            add("int i = 0;")
            add("while (i < 12) {")
            add("int i2 = iArr[i];")
            add("int i3 = i + 1;")
            add("int i4 = i;")
            add("for (int i5 = i3; i5 < 13; i5++) {")
            add("if (iArr[i5] < i2) {")
            add("i2 = iArr[i5];")
            add("i4 = i5;")
            add("}")
            add("}")
            add("if (i4 != i) {")
            add("iArr[i4] = iArr[i];")
            add("iArr[i] = i2;")
            add("}")
            add("i = i3;")
            add("}")
            add("return iArr;")
            add("")
            add("}")
        }
        val buffer = StringBuffer().apply {
            append("$stringFunName();")
        }
        val funName = buffer.toString()
        map[funName] = mutableList
        return map
    }

    fun generateIntFun9(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static int[] ${stringFunName}(int[] iArr, int i) {")
            add("int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);")
            add("copyOf[copyOf.length - 1] = i;")
            add("return copyOf;")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Arrays;")
        val buffer = StringBuffer().apply {
            append("$stringFunName(")
            append("new int[]{")
            repeat((10..40).random()) {
                append("${(1000..5000).random()},")
            }
            append("}")
            append(",${(1000..5000).random()});")
        }
        val funName = buffer.toString()
        map[funName] = mutableList
        return map
    }


    fun generateIntFun10(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private static int ${stringFunName}(long j, long j2) {")
            add("Calendar instance = Calendar.getInstance();")
            add("Calendar instance2 = Calendar.getInstance();")
            add("instance.setTime(new Date(j));")
            add("instance2.setTime(new Date(j2));")
            add("int i = instance.get(1);")
            add("int i2 = instance2.get(1);")
            add("int i3 = instance.get(2) + 1;")
            add("int i4 = instance2.get(2) + 1;")
            add("int i5 = instance.get(5);")
            add("int i6 = instance2.get(5);")
            add("int i7 = i2 - i;")
            add("if (Math.abs(i7) <= 1) {")
            add("return 0;")
            add("}")
            add("int i8 = i4 - i3;")
            add("return i8 > 0 ? Math.abs(i7) : (i8 != 0 || i6 - i5 < 0) ? Math.abs(i7) - 1 : Math.abs(i7);")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Calendar;")
        FileUtils.listPackage.add("import java.util.Date;")
        val funName = "$stringFunName( ${(1000..2000).random()}L, ${(1000..2000).random()}L);"
        map[funName] = mutableList
        return map
    }


    fun generateIntFun11(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private static int ${stringFunName}(String str) {")
            add("String str2 = str.split(\"-\")[0];")
            add("String str3 = str.split(\"-\")[1];")
            add("String str4 = str.split(\"-\")[2];")
            add("Calendar instance = Calendar.getInstance();")
            add("instance.set(1, Integer.parseInt(str2));")
            add("instance.set(2, Integer.parseInt(str3) - 1);")
            add("instance.set(5, Integer.parseInt(str4));")
            add("int i = instance.get(7);")
            add("if (i == 1) {")
            add("return 7;")
            add("}")
            add("if (i == 3) {")
            add("return 2;")
            add("}")
            add("if (i == 4) {")
            add("return 3;")
            add("}")
            add("if (i == 5) {")
            add("return 4;")
            add("}")
            add("if (i != 6) {")
            add("return i != 7 ? 1 : 6;")
            add("}")
            add("return 5;")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Calendar;")
        val funName = "$stringFunName(\"${generateFunName()}\");"
        map[funName] = mutableList
        return map
    }


    fun generateIntFun12(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static int ${stringFunName}(long j) {")
            add("if (j == 0) {")
            add("j = System.currentTimeMillis();")
            add("}")
            add("Calendar instance = Calendar.getInstance();")
            add("instance.setTime(new Date(j));")
            add("return instance.get(5);")
            add("}")
        }
        FileUtils.listPackage.add("import java.util.Calendar;")
        FileUtils.listPackage.add("import java.util.Date;")
        val funName = "$stringFunName( ${(1000..2000).random()}L);"
        map[funName] = mutableList
        return map
    }


    fun generateIntFun13(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static int  ${stringFunName}(int[] iArr, int i, int i2) {")
            add("int i3 = i - 1;")
            add(" int i4 = 0;")
            add("while (i4 <= i3) {")
            add("int i5 = (i4 + i3) >>> 1;")
            add("int i6 = iArr[i5];")
            add("if (i6 < i2) {")
            add("i4 = i5 + 1;")
            add("} else if (i6 <= i2) {")
            add(" return i5;")
            add(" } else {")
            add("i3 = i5 - 1;")
            add("}")
            add("}")
            add(" return i4 ^ -1;")
            add("}")
        }


        val buffer = StringBuffer().apply {
            append("$stringFunName(")
            append("new int[]{")
            repeat((10..40).random()) {
                append("${(1000..5000).random()},")
            }
            append("}")
            append(",${(1000..5000).random()},${(1000..5000).random()});")
        }


        val funName = buffer.toString()
        map[funName] = mutableList
        return map
    }


}