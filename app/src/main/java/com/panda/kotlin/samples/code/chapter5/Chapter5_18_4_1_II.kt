package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_4_1_II {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf(
            "one" to 1,
            "two" to 2,
            "three" to 3
        )
        numbersMap.putAll(setOf("four" to 4, "five" to 5))

        println(numbersMap)
        // sampleEnd
    }
}