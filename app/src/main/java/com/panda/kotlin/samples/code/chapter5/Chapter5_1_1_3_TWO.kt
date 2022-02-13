package com.panda.kotlin.samples.code.chapter5

class Chapter5_1_1_3_TWO {

    fun main() {
        // sampleStart
        // LinkedHashSet is the default implementation
        val numbers = setOf(1, 2, 3, 4)
        val numbersBackwards = setOf(4, 3, 2, 1)
        println(numbers.first() == numbersBackwards.first())
        println(numbers.first() == numbersBackwards.last())
        // sampleEnd
    }
}