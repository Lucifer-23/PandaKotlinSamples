package com.panda.kotlin.samples.code.chapter5

class Chapter5_1_1 {

    fun main() {
        // sampleStart
        val numbers = mutableListOf("one", "two", "three", "four")
        numbers.add("five") // 这是可以的
        // numbers = mutableListOf("six", "seven") // 编译错误
        // sampleEnd
    }
}