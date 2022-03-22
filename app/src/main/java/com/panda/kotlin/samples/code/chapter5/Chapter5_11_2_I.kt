package com.panda.kotlin.samples.code.chapter5

class Chapter5_11_2_I {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five", "six")

        println(numbers.take(3))
        println(numbers.takeLast(3))
        println(numbers.drop(1))
        println(numbers.dropLast(5))
        // sampleEnd
    }
}