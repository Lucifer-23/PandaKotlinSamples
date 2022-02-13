package com.panda.kotlin.samples.code.chapter5

class Chapter5_12_2_TWO {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five", "six")

        println(numbers.firstOrNull { it.length > 6 })
        // sampleEnd
    }
}