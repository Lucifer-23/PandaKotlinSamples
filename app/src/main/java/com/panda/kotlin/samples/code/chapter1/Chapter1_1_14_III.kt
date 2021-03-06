package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_14_III {

    fun main() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

        fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    }
}