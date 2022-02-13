package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_1_TWO {

    fun main() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        numbers.map { it.length }.filter { it > 3 }.let {
            println(it)
            // 如果需要可以调用更多函数
        }
    }
}