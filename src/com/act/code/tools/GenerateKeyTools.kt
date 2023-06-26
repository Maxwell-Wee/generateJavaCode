package com.act.code.tools

import java.io.File

private val chars1 = "qwertyuiopasdfghjklzxcvbnm".toCharArray()
private val chars2 = "1234567890".toCharArray()
private val chars3 = "QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray()
private val chars4 = "_".toCharArray()

val listType = mutableListOf<String>().apply {
    add("String")
    add("Boolean")
    add("char")
    add("Long")
    add("Double")
    add("int")
    add("Float")
    add("Byte")
    add("String[]")
    add("Boolean[]")
    add("char[]")
    add("Long[]")
    add("Double[]")
    add("int[]")
    add("Float[]")
    add("Byte[]")
}


// 创建对象名称
fun generateClassKey(keyLength: Int = 12): String {
    val buffer = StringBuffer()
    repeat(keyLength) {
        if (it == 0) {
            buffer.append(chars3.random())
        } else {
            buffer.append((chars1 + chars2 + chars3 + chars4).random())
        }
    }
    return buffer.toString()
}

// 创建对象名称
fun generateObjectKey(keyLength: Int = 12): String {
    val buffer = StringBuffer()
    repeat(keyLength) {
        if (it == 0) {
            buffer.append((chars1 + chars3).random())
        } else {
            buffer.append((chars1 + chars2 + chars3 + chars4).random())
        }
    }
    return buffer.toString()
}

// 创建对象名称
fun generateKey(keyLength: Int = 12): String {
    val buffer = StringBuffer()
    repeat(keyLength) {
        if (it == 0) {
            buffer.append((chars1).random())
        } else {
            buffer.append((chars1 + chars2).random())
        }
    }
    return buffer.toString()
}


// 创建方法名称
fun generateFunName(keyLength: Int = (8..18).random()): String {
    val buffer = StringBuffer()
    repeat(keyLength) {
        buffer.append((chars1 + chars3).random())
    }
    return buffer.toString()
}



// 创建对象名称
fun generateLayoutId(keyLength: Int = 12): String {
    val buffer = StringBuffer()
    repeat(keyLength) {
        buffer.append((chars1 + chars4).random())
    }
    return buffer.toString()
}



// 声明对象名称
fun generateDeclareObjectKey(keyLength: Int = (8..16).random()): String {
    val buffer = StringBuffer()
    repeat(keyLength) {
        buffer.append((chars1).random())
    }
    return buffer.toString()
}

fun genKey(keyLength: Int = (8..16).random()): String {
    val buffer = StringBuffer()
    repeat(keyLength) {
        buffer.append((chars3).random())
    }
    return buffer.toString()
}




fun totalFiles(): Int {
    val files = File("./com")
    redFile(files)
    return allFile.size
}

val allFile = mutableListOf<String>()
fun redFile(file: File) {
    if (file.isFile) {
        allFile.add(file.absolutePath)
    } else {
        file.listFiles()?.forEach {
            redFile(it)
        }
    }
}

fun redRandomChar(): Char {
    return (chars1 + chars2 + chars3 + chars4).random()
}




