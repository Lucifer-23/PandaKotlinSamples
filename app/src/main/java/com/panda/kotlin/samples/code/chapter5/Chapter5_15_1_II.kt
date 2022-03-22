package com.panda.kotlin.samples.code.chapter5

class Chapter5_15_1_II {

    fun main() {
        // sampleStart
        val numbers = mutableListOf(1, 2, 5, 6)
        numbers.addAll(arrayOf(7, 8))

        println(numbers)

        numbers.addAll(2, setOf(3, 4))

        println(numbers)
        // sampleEnd
    }
}