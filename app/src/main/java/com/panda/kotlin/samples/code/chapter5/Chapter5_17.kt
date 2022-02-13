package com.panda.kotlin.samples.code.chapter5

class Chapter5_17 {

    fun main() {
        // sampleStart
        val numbers = setOf("one", "two", "three")

        println(numbers union setOf("four", "five"))
        println(setOf("four", "five") union numbers)
        println(numbers intersect setOf("two", "one"))
        println(numbers subtract setOf("three", "four"))
        // 相同的输出
        println(numbers subtract setOf("four", "three"))
        // sampleEnd
    }
}