package com.panda.kotlin.samples.code.chapter5

class Chapter5_11_4_I {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")

        println(numbers.windowed(3))
        // sampleEnd
    }
}