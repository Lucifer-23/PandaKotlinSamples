package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_2_III {

    fun main() {
        // sampleStart
        val numberPairs = listOf(
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4
        )

        println(numberPairs)
        println(numberPairs.unzip())
        // sampleEnd
    }
}