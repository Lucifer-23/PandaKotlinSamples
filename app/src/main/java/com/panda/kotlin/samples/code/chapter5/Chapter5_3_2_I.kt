package com.panda.kotlin.samples.code.chapter5

class Chapter5_3_2_I {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "two", "three", "four")
        val mutableIterator = numbers.iterator()
        mutableIterator.next()
        mutableIterator.remove()
        println("After removal: $numbers")
        // sampleEnd
    }
}