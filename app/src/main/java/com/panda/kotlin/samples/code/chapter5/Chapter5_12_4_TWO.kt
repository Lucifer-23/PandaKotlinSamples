package com.panda.kotlin.samples.code.chapter5

class Chapter5_12_4_TWO {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five", "six")

        println(numbers.isEmpty())
        println(numbers.isNotEmpty())

        val empty = emptyList<String>()

        println(empty.isEmpty())
        println(empty.isNotEmpty())
        // sampleEnd
    }
}