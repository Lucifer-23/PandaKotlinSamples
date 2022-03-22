package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_4_II {

    fun main() {
        val str = "Hello"
        val caps = str.takeIf { it.isNotEmpty() }?.toUpperCase()

        // 编译错误
        // val caps = str.takeIf { it.isNotEmpty() }.toUpperCase()
        println(caps)
    }
}