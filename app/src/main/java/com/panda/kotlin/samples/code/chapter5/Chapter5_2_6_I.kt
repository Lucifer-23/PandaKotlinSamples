package com.panda.kotlin.samples.code.chapter5

class Chapter5_2_6_I {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val longerThan3 = numbers.filter { it.length > 3 }
        println(longerThan3)
        // sampleEnd
    }
}