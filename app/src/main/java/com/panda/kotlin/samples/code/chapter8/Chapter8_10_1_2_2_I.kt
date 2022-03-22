package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_1_2_2_I {

    fun main() {
        val numbers = mutableListOf("one", "two", "three")
        val countEndsWithE = numbers.run {
            add("four")
            add("five")
            count { it.endsWith("e") }
        }
        println("There are $countEndsWithE elements that end with e.")
    }
}