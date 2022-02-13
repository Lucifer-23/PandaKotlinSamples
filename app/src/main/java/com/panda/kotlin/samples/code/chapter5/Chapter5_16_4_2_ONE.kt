package com.panda.kotlin.samples.code.chapter5

class Chapter5_16_4_2_ONE {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "five", "three")
        numbers[1] = "two"

        println(numbers)
        // sampleEnd
    }
}