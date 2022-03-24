package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_21 {
    class Turtle {
        fun penDown() {}
        fun penUp() {}
        fun turn(degress: Double) {}
        fun forward(pixels: Double) {}
    }

    fun main() {
        val myTurtle = Turtle()
        with(myTurtle) { // 画一个100像素的正方形
            penDown()
            for (i in 1..4) {
                forward(100.0)
                turn(90.0)
            }
            penUp()
        }
    }
}