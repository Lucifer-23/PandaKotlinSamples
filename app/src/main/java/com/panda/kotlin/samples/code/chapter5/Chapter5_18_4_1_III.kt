package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_4_1_III {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf("one" to 1, "two" to 2)
        val previousValue = numbersMap.put("one", 11)

        println(
            "value associated with 'one', before: " +
                    "$previousValue, after: ${numbersMap["one"]}"
        )

        println(numbersMap)
        // sampleEnd
    }
}