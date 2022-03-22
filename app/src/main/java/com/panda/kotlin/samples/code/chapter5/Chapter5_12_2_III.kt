package com.panda.kotlin.samples.code.chapter5

class Chapter5_12_2_III {

    fun main() {
        // sampleStart
        val numbers = listOf(1, 2, 3, 4)

        println(numbers.find { it % 2 == 0 })
        println(numbers.findLast { it % 2 == 0 })
        // sampleEnd
    }
}