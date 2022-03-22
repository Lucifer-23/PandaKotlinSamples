package com.panda.kotlin.samples.code.chapter5

class Chapter5_1_1_4_II {

    fun main() {
        // sampleStart
        val numbersMap = mapOf(
            "key1" to 1,
            "key2" to 2,
            "key3" to 3,
            "key4" to 1
        )

        val anotherMap = mapOf(
            "key2" to 2,
            "key1" to 1,
            "key4" to 1,
            "key3" to 3
        )

        println("The maps are equal: ${numbersMap == anotherMap}")
        // sampleEnd
    }
}