package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_13_IV {

    fun main() {
        for (x in 1..10 step 2) {
            print(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
        println()
    }
}