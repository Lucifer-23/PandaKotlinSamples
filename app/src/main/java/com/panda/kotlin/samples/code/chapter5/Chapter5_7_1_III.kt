package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_1_III {

    fun main() {
        // sampleStart
        val numbersMap = mapOf(
            "key1" to 1,
            "key2" to 2,
            "key3" to 3,
            "key11" to 11
        )

        println(numbersMap.mapKeys { it.key.toUpperCase() })
        println(numbersMap.mapValues { it.value + it.key.length })
        // sampleEnd
    }
}