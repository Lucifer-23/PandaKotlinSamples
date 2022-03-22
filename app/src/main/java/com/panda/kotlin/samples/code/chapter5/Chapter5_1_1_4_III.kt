package com.panda.kotlin.samples.code.chapter5

class Chapter5_1_1_4_III {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf("one" to 1, "two" to 2)
        numbersMap.put("three", 3)
        numbersMap["one"] = 11
        println(numbersMap)
        // sampleEnd
    }
}