package com.panda.kotlin.samples.code.chapter5

class Chapter5_12_1_ONE {

    fun main() {
        // sampleStart
        val numbers = linkedSetOf("one", "two", "three", "four", "five")

        println(numbers.elementAt(3))

        val numbersSortedSet = sortedSetOf("one", "two", "three", "four")

        // 元素以升序存储
        println(numbersSortedSet.elementAt(0))
        // sampleEnd
    }
}