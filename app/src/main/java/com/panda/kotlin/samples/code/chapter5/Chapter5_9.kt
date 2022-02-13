package com.panda.kotlin.samples.code.chapter5

class Chapter5_9 {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val plusList = numbers + "five"
        val minusList = numbers - listOf("three", "four")

        println(plusList)
        println(minusList)
        // sampleEnd
    }
}