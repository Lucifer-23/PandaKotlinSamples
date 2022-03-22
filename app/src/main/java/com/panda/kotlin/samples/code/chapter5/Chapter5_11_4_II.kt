package com.panda.kotlin.samples.code.chapter5

class Chapter5_11_4_II {

    fun main() {
        // sampleStart
        val numbers = (1..10).toList()

        println(numbers.windowed(3, step = 2, partialWindows = true))
        println(numbers.windowed(3) { it.sum() })
        // sampleEnd
    }
}