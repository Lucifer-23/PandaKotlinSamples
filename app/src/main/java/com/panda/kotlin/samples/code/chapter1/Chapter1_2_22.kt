package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_22 {
    class Rectangle(var length: Int = 0, var breadth: Int = 0, var color: Int = 0)

    fun main() {
        val myRectangle = Rectangle().apply {
            length = 4
            breadth = 5
            color = 0xFAFAFA
        }
    }
}