package com.panda.kotlin.samples.code.chapter5

class Chapter5_8_3_II {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val empty = emptyList<String>()

        println(numbers.any())
        println(empty.any())
        println(numbers.none())
        println(empty.none())
        // sampleEnd
    }
}