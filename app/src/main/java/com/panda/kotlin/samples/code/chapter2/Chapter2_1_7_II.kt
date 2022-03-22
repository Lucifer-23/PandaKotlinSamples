package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_7_II {

    fun main() {
        // 创建一个Array<String>初始化为["0", "1", "4", "9", "16"]
        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { println(it) }
    }
}