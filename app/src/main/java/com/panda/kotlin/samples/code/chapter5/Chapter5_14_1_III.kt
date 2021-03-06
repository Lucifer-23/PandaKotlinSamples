package com.panda.kotlin.samples.code.chapter5

class Chapter5_14_1_III {

    fun main() {
        // sampleStart
        val numbers = listOf(5, 2, 10, 4)
        val sumEven =
            numbers.foldIndexed(0) { idx, sum, element ->
                if (idx % 2 == 0) sum + element else sum
            }

        println(sumEven)

        val sumEvenRight =
            numbers.foldRightIndexed(0) { idx, element, sum ->
                if (idx % 2 == 0) sum + element else sum
            }

        println(sumEvenRight)
        // sampleEnd
    }
}