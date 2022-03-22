package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_8_III {

    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        // sampleStart
        // ……
        if (x == null) {
            println("Wrong number format in arg1: '$arg1'")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: '$arg2'")
            return
        }
        // 在空检测后，x 与y 会自动转换为非空值
        println(x * y)
        // sampleEnd
    }

    // sampleEnd
    fun main() {
        printProduct("6", "7")
        printProduct("a", "7")
        printProduct("a", "b")
    }
}