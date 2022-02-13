package com.panda.kotlin.samples.code.chapter5

class Chapter5_13_1 {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")

        println("Sorted ascending: ${numbers.sorted()}")
        println("Sorted descending: ${numbers.sortedDescending()}")
        // sampleEnd
    }
}