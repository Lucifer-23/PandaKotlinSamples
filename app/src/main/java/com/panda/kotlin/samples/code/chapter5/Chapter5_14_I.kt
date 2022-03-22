package com.panda.kotlin.samples.code.chapter5

class Chapter5_14_I {

    fun main() {
        // sampleStart
        val numbers = listOf(6, 42, 10, 4)

        println("Count: ${numbers.count()}")
        println("Max: ${numbers.maxOrNull()}")
        println("Min: ${numbers.minOrNull()}")
        println("Average: ${numbers.average()}")
        println("Sum: ${numbers.sum()}")
        // sampleEnd
    }
}