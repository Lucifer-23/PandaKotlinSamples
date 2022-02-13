package com.panda.kotlin.samples.code.chapter5

class Chapter5_12_1_THREE {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five")

        println(numbers.elementAtOrNull(5))
        println(numbers.elementAtOrElse(5) { index ->
            "The value for index $index is undefined"
        })
        // sampleEnd
    }
}