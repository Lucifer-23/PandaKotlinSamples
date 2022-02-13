package com.panda.kotlin.samples.code.chapter5

class Chapter5_10_TWO {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five", "six")

        println(numbers.groupingBy { it.first() }.eachCount())
        // sampleEnd
    }
}