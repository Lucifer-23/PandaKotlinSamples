package com.panda.kotlin.samples.code.chapter5

class Chapter5_11_4_III {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four", "five")

        println(numbers.zipWithNext())
        println(numbers.zipWithNext() { s1, s2 -> s1.length > s2.length })
        // sampleEnd
    }
}