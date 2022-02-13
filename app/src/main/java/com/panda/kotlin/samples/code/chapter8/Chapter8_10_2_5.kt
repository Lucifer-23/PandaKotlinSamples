package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_5 {

    fun main() {
        val numbers = mutableListOf("one", "two", "three")
        numbers
            .also { println("The list elements before adding new one: $it") }
            .add("four")
    }
}