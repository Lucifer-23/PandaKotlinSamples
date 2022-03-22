package com.panda.kotlin.samples.code.chapter5

class Chapter5_13_2_II {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")

        println(
            "Sorted by length ascending: " +
                    "${numbers.sortedWith(compareBy { it.length })}"
        )
        // sampleEnd
    }
}