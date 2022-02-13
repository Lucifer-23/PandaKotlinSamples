package com.panda.kotlin.samples.code.chapter5

class Chapter5_8_2 {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val (match, rest) = numbers.partition { it.length > 3 }

        println(match)
        println(rest)
        // sampleEnd
    }
}