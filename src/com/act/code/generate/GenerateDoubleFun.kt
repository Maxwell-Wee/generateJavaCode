package com.act.code.generate

import com.act.code.tools.generateFunName

object GenerateDoubleFun {


    fun generateDoubleFun(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static double ${stringFunName}(double[] dArr) {")
            add("double d = dArr[0];")
            add("for (int i = 0; i < dArr.length; i++) {")
            add("if (d < dArr[i]) {")
            add("d = dArr[i];")
            add("}")
            add("}")
            add("return d;")
            add("}")
        }
        val funName = "$stringFunName( new double[]{${(1000..2000).random()}.0d, ${(1000..2000).random()}.0d, ${(1000..2000).random()}.0d, ${(1000..2000).random()}.0d});"
        map[funName] = mutableList
        return map
    }

    fun generateDoubleFun2(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static double ${stringFunName}(double[] dArr) {")
            add("double d = 0.0d;")
            add("for (double d2 : dArr) {")
            add("d += d2;")
            add("}")
            add("return d;")
            add("}")

        }
        val funName = "$stringFunName(new double[]{${(1000..2000).random()}.0d, ${(1000..2000).random()}.0d});"
        map[funName] = mutableList
        return map
    }

}