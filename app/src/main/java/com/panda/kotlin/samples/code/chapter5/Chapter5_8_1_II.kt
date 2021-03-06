package com.panda.kotlin.samples.code.chapter5

class Chapter5_8_1_II {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val filteredIdx = numbers.filterIndexed { index, s ->
            (index != 0) && (s.length < 5)
        }
        val filteredNot = numbers.filterNot { it.length <= 3 }

        println(filteredIdx)
        println(filteredNot)
        // sampleEnd
    }
}