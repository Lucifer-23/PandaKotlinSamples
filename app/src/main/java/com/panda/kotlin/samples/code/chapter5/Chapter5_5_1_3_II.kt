package com.panda.kotlin.samples.code.chapter5

class Chapter5_5_1_3_II {

    fun main() {
        // sampleStart
        val oddNumbersLessThan10 = generateSequence(1) {
            if (it < 10) it + 2 else null
        }

        println(oddNumbersLessThan10.toList())
        println(oddNumbersLessThan10.count())
        // sampleEnd
    }
}