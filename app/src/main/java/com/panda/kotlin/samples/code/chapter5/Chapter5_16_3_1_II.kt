package com.panda.kotlin.samples.code.chapter5

class Chapter5_16_3_1_II {

    fun main() {
        // sampleStart
        val numbers = mutableListOf(1, 2, 3, 4)

        println(numbers.indexOfFirst { it > 2 })
        println(numbers.indexOfLast { it % 2 == 1 })
        // sampleEnd
    }
}