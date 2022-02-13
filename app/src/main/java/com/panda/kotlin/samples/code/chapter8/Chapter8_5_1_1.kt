package com.panda.kotlin.samples.code.chapter8

class Chapter8_5_1_1 {

    data class Point(val x: Int, val y: Int)

    operator fun Point.unaryMinus() = Point(-x, -y)

    val point = Point(10, 20)

    fun main() {
        // 输出"Point(x=-10, y=-20)"
        println(-point)
    }
}