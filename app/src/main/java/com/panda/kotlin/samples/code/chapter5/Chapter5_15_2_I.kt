package com.panda.kotlin.samples.code.chapter5

class Chapter5_15_2_I {

    fun main() {
        // sampleStart
        val numbers = mutableListOf(1, 2, 3, 4, 3)
        // 删除了第一个'3'
        numbers.remove(3)

        println(numbers)

        // 什么都没删除
        numbers.remove(5)

        println(numbers)
        // sampleEnd
    }
}