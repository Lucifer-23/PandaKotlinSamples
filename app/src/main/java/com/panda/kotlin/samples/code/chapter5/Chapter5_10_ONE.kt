package com.panda.kotlin.samples.code.chapter5

class Chapter5_10_ONE {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five")

        println(numbers.groupBy { it.first().toUpperCase() })
        println(
            numbers.groupBy(keySelector = { it.first() },
                valueTransform = {
                    it.toUpperCase()
                })
        )
        // sampleEnd
    }
}