package com.panda.kotlin.samples.code.chapter3

class Chapter3_8_2_2_I {

    class Star<out T>

    fun main() {
        val star: Star<Number> = Star<Int>()
        var star2: Star<*> = star
    }
}