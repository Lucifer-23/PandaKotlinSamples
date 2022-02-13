package com.panda.kotlin.samples.code.chapter5

class Chapter5_15_1_THREE {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "two")
        numbers += "three"

        println(numbers)

        numbers += listOf("four", "five")

        println(numbers)
        // sampleEnd
    }
}