package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_14_II {

    fun main() {
        val items = setOf("apple", "banana", "kiwifruit")

        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }
    }
}