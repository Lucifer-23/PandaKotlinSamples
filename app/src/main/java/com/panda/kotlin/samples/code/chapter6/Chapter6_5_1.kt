package com.panda.kotlin.samples.code.chapter6

class Chapter6_5_1 {
    fun foo(): List<Int> = listOf(1, 2, 3)

    fun main() {
        foo().forEach { value -> println(value) }
    }
}