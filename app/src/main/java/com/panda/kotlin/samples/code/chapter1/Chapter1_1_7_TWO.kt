package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_7_TWO {

    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    fun main() {
        println("max of 0 and 42 is ${maxOf(0, 42)}")
    }
}