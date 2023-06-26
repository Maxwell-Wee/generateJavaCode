package com.act.code.generate

import com.act.code.tools.generateClassKey
import com.act.code.tools.generateFunName

object GenerateBooleanFun {

    fun generateBooleanFun(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private static boolean ${stringFunName}(String str) {")
            add("if (str == null) {")
            add("return true;")
            add("}")
            add("int length = str.length();")
            add("for (int i = 0; i < length; i++) {")
            add(" if (!Character.isWhitespace(str.charAt(i))) {")
            add("return false;")
            add("}")
            add("}")
            add("return true;")
            add("}")
        }
        val funName = "$stringFunName(\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }

    fun generateBooleanFun2(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("private static boolean ${stringFunName}(String str) {")
            add("return str == null || str.trim().length() == 0;")
            add("}")
        }
        val funName = "$stringFunName(\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }


    fun generateBooleanFun3(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static boolean ${stringFunName}(CharSequence charSequence, CharSequence charSequence2) {")
            add("int length;")
            add("if (charSequence == charSequence2) {")
            add("return true;")
            add("}")
            add("if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {")
            add("return false;")
            add("}")
            add("if ((charSequence instanceof String) && (charSequence2 instanceof String)) {")
            add("return charSequence.equals(charSequence2);")
            add("}")
            add("for (int i = 0; i < length; i++) {")
            add("if (charSequence.charAt(i) != charSequence2.charAt(i)) {")
            add("return false;")
            add("}")
            add("}")
            add("return true;")
            add("}")
        }
        val funName = "$stringFunName(\"${generateClassKey()}\",\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }

//    public static boolean evhGEyUIgdl(CharSequence charSequence, CharSequence charSequence2) {  return charSequence == null && charSequence2 == null; }

    fun generateBooleanFun4(): HashMap<String, MutableList<String>> {
        val map = HashMap<String, MutableList<String>>()
        val stringFunName = generateFunName()
        val mutableList = mutableListOf<String>().apply {
            add("public static boolean ${stringFunName}(CharSequence charSequence, CharSequence charSequence2) {  return charSequence == null && charSequence2 == null; }")
        }
        val funName = "$stringFunName(\"${generateClassKey()}\",\"${generateClassKey()}\");"
        map[funName] = mutableList
        return map
    }


}