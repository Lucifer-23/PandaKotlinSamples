package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_13_ONE {

    fun main() {
        val x = 10
        val y = 9
        if (x in 1..y + 1) {
            println("fits in range")
        }
    }
}