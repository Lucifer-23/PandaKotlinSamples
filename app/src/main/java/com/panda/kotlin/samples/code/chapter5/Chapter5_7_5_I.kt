package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_5_I {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")

        println(numbers)
        println(numbers.joinToString())

        val listString = StringBuffer("The list of numbers: ")
        numbers.joinTo(listString)

        println(listString)
        // sampleEnd
    }
}