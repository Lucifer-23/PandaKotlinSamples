package com.panda.kotlin.samples.code.chapter3

class Chapter3_15_1_1 {
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }

    fun main() {
        println(lazyValue)
        println(lazyValue)
    }
}