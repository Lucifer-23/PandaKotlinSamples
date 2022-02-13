package com.panda.kotlin.samples.code.chapter5

class Chapter5_1_1_2_THREE {

    fun main() {
        // sampleStart
        val numbers = mutableListOf(1, 2, 3, 4)
        numbers.add(5)
        numbers.removeAt(1)
        numbers[0] = 0
        numbers.shuffle()
        println(numbers)
        // sampleEnd
    }
}