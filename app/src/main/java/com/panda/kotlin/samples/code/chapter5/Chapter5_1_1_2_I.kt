package com.panda.kotlin.samples.code.chapter5

class Chapter5_1_1_2_I {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        println("Number of elements: ${numbers.size}")
        println("Third element: ${numbers.get(2)}")
        println("Fourth element: ${numbers[3]}")
        println("Index of element \"two\" ${numbers.indexOf("two")}")
        // sampleEnd
    }
}