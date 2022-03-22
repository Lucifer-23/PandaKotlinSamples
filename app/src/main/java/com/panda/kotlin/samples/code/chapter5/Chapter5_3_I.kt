package com.panda.kotlin.samples.code.chapter5

class Chapter5_3_I {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val numbersIterator = numbers.iterator()

        while (numbersIterator.hasNext()) {
            println(numbersIterator.next())
        }
        // sampleEnd
    }
}