package com.panda.kotlin.samples.code.chapter5

class Chapter5_11_2_II {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five", "six")

        println(numbers.takeWhile { !it.startsWith('f') })
        println(numbers.takeLastWhile { it != "three" })
        println(numbers.dropWhile { it.length == 3 })
        println(numbers.dropLastWhile { it.contains('i') })
        // sampleEnd
    }
}