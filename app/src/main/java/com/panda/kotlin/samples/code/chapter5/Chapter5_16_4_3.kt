package com.panda.kotlin.samples.code.chapter5

class Chapter5_16_4_3 {

    fun main() {
        // sampleStart
        val numbers = mutableListOf(1, 2, 3, 4, 3)
        numbers.removeAt(1)

        println(numbers)
        // sampleEnd
    }
}