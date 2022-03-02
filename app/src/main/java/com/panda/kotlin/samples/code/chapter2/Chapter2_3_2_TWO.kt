package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_2_TWO {

    fun main() {

        val x = 4
        when (x) {
            0, 1-> println("x == 0 or x == 1")
            else -> println("otherwise")
        }
    }
}