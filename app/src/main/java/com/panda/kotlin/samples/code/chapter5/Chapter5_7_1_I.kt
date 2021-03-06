package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_1_I {

    fun main() {
        // sampleStart
        val numbers = setOf(1, 2, 3)
        println(numbers.map { it * 3 })
        println(numbers.mapIndexed { idx, value -> value * idx })
        // sampleEnd
    }
}