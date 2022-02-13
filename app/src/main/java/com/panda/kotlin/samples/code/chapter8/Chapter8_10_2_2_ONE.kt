package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_2_ONE {

    fun main() {
        val numbers = mutableListOf("one", "two", "three")
        with(numbers) {
            println("'with' is called with argument $this")
            println("It contains $size elements")
        }
    }
}