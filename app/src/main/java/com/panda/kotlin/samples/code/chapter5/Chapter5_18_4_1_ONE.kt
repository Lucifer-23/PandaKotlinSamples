package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_4_1_ONE {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf("one" to 1, "two" to 2)
        numbersMap.put("three", 3)

        println(numbersMap)
        // sampleEnd
    }
}