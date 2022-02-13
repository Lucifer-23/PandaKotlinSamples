package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_5_THREE {

    fun main() {
        // sampleStart
        val numbers = (1..100).toList()

        println(
            numbers.joinToString(
                limit = 10,
                truncated = "<...>"
            )
        )
        // sampleEnd
    }
}