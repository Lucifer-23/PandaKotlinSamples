package com.panda.kotlin.samples.code.chapter5

class Chapter5_13_2_III {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "two", "three", "four")
        val reversedNumbers = numbers.asReversed()

        println(reversedNumbers)

        numbers.add("five")

        println(reversedNumbers)
        // sampleEnd
    }
}