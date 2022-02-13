package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_4_1_FOUR {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf("one" to 1, "two" to 2)
        // 调用numbersMap.put("three", 3)
        numbersMap["three"] = 3
        numbersMap += mapOf("four" to 4, "five" to 5)

        println(numbersMap)
        // sampleEnd
    }
}