package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_3_TWO {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")

        println(numbers.associateBy { it.first().toUpperCase() })
        println(
            numbers.associateBy(keySelector = { it.first().toUpperCase() },
                valueTransform = { it.length })
        )
        // sampleEnd
    }
}