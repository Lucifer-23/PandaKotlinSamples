package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_1_III {

    fun main() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        numbers.map { it.length }.filter { it > 3 }.let(::println)
    }
}