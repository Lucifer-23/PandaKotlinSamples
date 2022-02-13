package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_11 {

    fun main() {
        val items = listOf("apple", "banana", "kiwifruit")
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }
}