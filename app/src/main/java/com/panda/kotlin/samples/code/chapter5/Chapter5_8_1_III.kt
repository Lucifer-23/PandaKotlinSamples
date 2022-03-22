package com.panda.kotlin.samples.code.chapter5

class Chapter5_8_1_III {

    fun main() {
        // sampleStart
        val numbers = listOf(null, 1, "two", 3.0, "four")

        println("All String elements in upper case:")

        numbers.filterIsInstance<String>().forEach {
            println(it.toUpperCase())
        }
        // sampleEnd
    }
}