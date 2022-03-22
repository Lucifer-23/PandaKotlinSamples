package com.panda.kotlin.samples.code.chapter5

class Chapter5_3_2_II {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "four", "four")
        val mutableListIterator = numbers.listIterator()
        mutableListIterator.next()
        mutableListIterator.add("two")
        mutableListIterator.next()
        mutableListIterator.set("three")
        println(numbers)
        // sampleEnd
    }
}