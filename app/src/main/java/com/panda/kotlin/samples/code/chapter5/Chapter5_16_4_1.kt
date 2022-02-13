package com.panda.kotlin.samples.code.chapter5

class Chapter5_16_4_1 {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "five", "six")

        numbers.add(1, "two")
        numbers.addAll(2, listOf("three", "four"))
        println(numbers)
        // sampleEnd
    }
}