package com.panda.kotlin.samples.code.chapter5

class Chapter5_15_2_THREE {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "two", "three", "three", "four")
        numbers -= "three"

        println(numbers)

        numbers -= listOf("four", "five")
        // 与上述相同
        // numbers -= listOf("four")

        println(numbers)
        // sampleEnd
    }
}