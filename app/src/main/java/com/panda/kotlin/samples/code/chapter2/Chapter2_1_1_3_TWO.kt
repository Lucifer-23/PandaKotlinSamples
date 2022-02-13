package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_1_3_TWO {

    fun main() {
        // sampleStart
        val a: Int = 10000
        println(a == a) // 输出"true"
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA == anotherBoxedA) // 输出"true"
        // sampleEnd
    }
}