package com.panda.kotlin.samples.code.chapter8

class Chapter8_9_3_3_ONE {

    val x = 1

    fun main() {
        println(::x.get())
        println(::x.name)
    }
}