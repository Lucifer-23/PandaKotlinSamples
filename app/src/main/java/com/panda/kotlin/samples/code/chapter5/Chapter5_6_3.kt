package com.panda.kotlin.samples.code.chapter5

class Chapter5_6_3 {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "two", "three", "four")
        val sortedNumbers = numbers.sorted()
        println(numbers == sortedNumbers) // false
        numbers.sort()
        println(numbers == sortedNumbers) // true
        // sampleEnd
    }
}