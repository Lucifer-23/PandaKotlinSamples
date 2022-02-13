package com.panda.kotlin.samples.code.chapter5

class Chapter5_13_2_ONE {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val sortedNumbers = numbers.sortedBy { it.length }

        println("Sorted by length ascending: $sortedNumbers")

        val sortedByLast = numbers.sortedByDescending { it.last() }

        println("Sorted by the last letter descending: $sortedByLast")
        // sampleEnd
    }
}