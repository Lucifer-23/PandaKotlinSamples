package com.panda.kotlin.samples.code.chapter5

class Chapter5_16_3_3_TWO {

    fun main() {
        // sampleStart
        val colors = listOf("Blue", "green", "ORANGE", "Red", "yellow")

        println(
            colors.binarySearch(
                "RED",
                String.CASE_INSENSITIVE_ORDER
            )
        ) // 3
        // sampleEnd
    }
}