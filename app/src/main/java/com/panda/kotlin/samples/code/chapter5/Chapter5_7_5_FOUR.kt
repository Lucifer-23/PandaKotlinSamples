package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_5_FOUR {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")

        println(numbers.joinToString { "Element: ${it.toUpperCase()}" })
        // sampleEnd
    }
}