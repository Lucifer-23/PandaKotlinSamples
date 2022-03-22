package com.panda.kotlin.samples.code.chapter8

class Chapter8_9_3_3_I {

    val x = 1

    fun main() {
        println(::x.get())
        println(::x.name)
    }
}