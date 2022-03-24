package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_7 {

    fun main() {
        val map = mapOf("one" to 1, "two" to 2, "three" to 3)

        for((k, v) in map) {
            println("$k -> $v")
        }
    }
}