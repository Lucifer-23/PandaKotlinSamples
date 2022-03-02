package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_1_TWO {

    fun main() {

        val a = 3
        val b = 4

        val max = if (a > b) {
            println("Choose a")
            a
        } else {
            println("Choose b")
            b
        }
    }
}