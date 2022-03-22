package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_1_I {

    fun main() {
        // sampleStart
        val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)

        println(numbersMap.get("one"))
        println(numbersMap["one"])
        println(numbersMap.getOrDefault("four", 10))
        println(numbersMap["five"]) // null
        // numbersMap.getValue("six") // exception!
        // sampleEnd
    }
}