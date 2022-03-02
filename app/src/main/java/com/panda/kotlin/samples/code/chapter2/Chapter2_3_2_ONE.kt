package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_2_ONE {

    fun main() {

        val x = 4
        when (x) {
            1 -> println("x == 1")
            2-> println("x == 2")
            else -> { // 注意这个块
                println("x is neither 1 nor 2")
            }
        }
    }
}