package com.panda.kotlin.samples.code.chapter5

class Chapter5_5_1_4 {

    fun main() {
        // sampleStart
        val oddNumbers = sequence {
            yield(1)
            yieldAll(listOf(3, 5))
            yieldAll(generateSequence(7) { it + 2 })
        }

        println(oddNumbers.take(5).toList())
        // sampleEnd
    }
}