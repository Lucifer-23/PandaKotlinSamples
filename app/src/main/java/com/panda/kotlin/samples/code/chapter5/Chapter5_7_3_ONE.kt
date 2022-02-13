package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_3_ONE {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        println(numbers.associateWith { it.length })
        // sampleEnd
    }
}