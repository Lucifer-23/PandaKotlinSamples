package com.panda.kotlin.samples.code.chapter5

class Chapter5_18_4_2_III {

    fun main() {
        // sampleStart
        val numbersMap = mutableMapOf(
            "one" to 1,
            "two" to 2,
            "three" to 3
        )
        numbersMap -= "two"

        println(numbersMap)

        // 不会删除任何条目
        numbersMap -= "five"

        println(numbersMap)
        // sampleEnd
    }
}