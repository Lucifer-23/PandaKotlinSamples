package com.panda.kotlin.samples.code.chapter5

class Chapter5_5_1_3_I {

    fun main() {
        // sampleStart
        // 'it'是上一个元素
        val oddNumbers = generateSequence(1) { it + 2 }
        println(oddNumbers.take(5).toList())
        // println(oddNumbers.count()) // 错误：此序列是无限的。
        // sampleEnd
    }
}