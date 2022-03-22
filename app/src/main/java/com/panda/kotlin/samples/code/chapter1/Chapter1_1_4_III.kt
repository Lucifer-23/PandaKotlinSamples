package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_4_III {
    val PI = 3.14
    var x = 0

    fun incrementX() {
        x += 1
    }

    fun main() {
        println("x = $x; PI = $PI")
        incrementX()
        println("incrementX()")
        println("x = $x; PI = $PI")
    }
}