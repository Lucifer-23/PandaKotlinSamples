package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_2_TWO {

    fun main() {
        val numbers = mutableListOf("one", "two", "three")
        val firstAndLast = with(numbers) {
            "The first element is ${first()}," +
                    " the last element is ${last()}"
        }
        println(firstAndLast)
    }
}