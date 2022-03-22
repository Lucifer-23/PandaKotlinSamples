package com.panda.kotlin.samples.code.chapter5

class Chapter5_8_3_I {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")

        println(numbers.any { it.endsWith("e") })
        println(numbers.none { it.endsWith("a") })
        println(numbers.all { it.endsWith("e") })

        // vacuous truth
        println(emptyList<Int>().all { it > 5 })
        // sampleEnd
    }
}