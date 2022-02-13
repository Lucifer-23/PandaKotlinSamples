package com.panda.kotlin.samples.code.chapter5

class Chapter5_14_THREE {

    fun main() {
        // sampleStart
        val numbers = listOf(5, 42, 10, 4)

        println(numbers.sumBy { it * 2 })
        println(numbers.sumByDouble { it.toDouble() / 2 })
        // sampleEnd
    }
}