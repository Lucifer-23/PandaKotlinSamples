package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_4_ONE {

    fun main() {
        // sampleStart
        val numberSets = listOf(
            setOf(1, 2, 3),
            setOf(4, 5, 6),
            setOf(1, 2)
        )

        println(numberSets.flatten())
        // sampleEnd
    }
}