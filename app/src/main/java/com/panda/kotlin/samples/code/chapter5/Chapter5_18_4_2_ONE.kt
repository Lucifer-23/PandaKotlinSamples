package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_4_2_ONE {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
        numbersMap.remove("one")

        println(numbersMap)

        // 不会删除任何条目
        numbersMap.remove("three", 4)

        println(numbersMap)
        // sampleEnd
    }
}