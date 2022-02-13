package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_10_TWO {
    fun main() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }
}