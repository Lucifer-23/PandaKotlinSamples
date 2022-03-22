package com.panda.kotlin.samples.code.chapter5

class Chapter5_14_1_II {

    fun main() {
        // sampleStart
        val numbers = listOf(5, 2, 10, 4)
        val sumDoubledRight = numbers.foldRight(0) { element,
                                                     sum ->
            sum + element * 2
        }

        println(sumDoubledRight)
        // sampleEnd
    }
}