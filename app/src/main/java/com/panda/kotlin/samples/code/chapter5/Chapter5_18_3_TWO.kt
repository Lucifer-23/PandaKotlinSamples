package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_3_TWO {

    fun main() {
        // sampleStart
        val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

        println(numbersMap - "one")
        println(numbersMap - listOf("two", "four"))
        // sampleEnd
    }
}