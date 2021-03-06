package com.panda.kotlin.samples.code.chapter5

class Chapter5_15_2_II {

    fun main() {
        // sampleStart
        val numbers = mutableListOf(1, 2, 3, 4)

        println(numbers)

        numbers.retainAll { it >= 3 }

        println(numbers)

        numbers.clear()

        println(numbers)

        val numbersSet = mutableSetOf("one", "two", "three", "four")

        numbersSet.removeAll(setOf("one", "two"))

        println(numbersSet)
        // sampleEnd
    }
}