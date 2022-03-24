package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_11 {

    fun main() {
        val map = mutableMapOf("key" to 1, "b" to 2, "c" to 3)

        println(map["key"])
        map["key"] = 0
    }
}