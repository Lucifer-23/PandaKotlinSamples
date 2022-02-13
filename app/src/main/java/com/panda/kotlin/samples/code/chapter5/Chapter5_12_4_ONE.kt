package com.panda.kotlin.samples.code.chapter5

class Chapter5_12_4_ONE {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five", "six")

        println(numbers.contains("four"))
        println("zero" in numbers)
        println(numbers.containsAll(listOf("four", "two")))
        println(numbers.containsAll(listOf("one", "zero")))
        // sampleEnd
    }
}