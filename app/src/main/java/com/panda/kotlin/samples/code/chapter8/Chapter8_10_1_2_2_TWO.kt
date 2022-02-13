package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_1_2_2_TWO {

    fun main() {
        val numbers = mutableListOf("one", "two", "three")
        with(numbers) {
            val firstItem = first()
            val lastItem = last()
            println("First item: $firstItem, last item: $lastItem")
        }
    }
}