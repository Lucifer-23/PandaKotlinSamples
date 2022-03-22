package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_4_2_II {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf(
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "threeAgain" to 3
        )
        numbersMap.keys.remove("one")

        println(numbersMap)

        numbersMap.values.remove(3)

        println(numbersMap)
        // sampleEnd
    }
}