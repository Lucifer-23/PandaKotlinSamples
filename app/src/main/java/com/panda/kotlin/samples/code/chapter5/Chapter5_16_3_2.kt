package com.panda.kotlin.samples.code.chapter5

class Chapter5_16_3_2 {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "two", "three", "four")
        numbers.sort()

        println(numbers)
        println(numbers.binarySearch("two")) // 3
        println(numbers.binarySearch("z")) // -5
        println(numbers.binarySearch("two", 0, 2)) // -3
        // sampleEnd
    }
}