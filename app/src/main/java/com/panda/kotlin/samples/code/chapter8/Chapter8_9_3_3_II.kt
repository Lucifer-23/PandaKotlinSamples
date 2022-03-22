package com.panda.kotlin.samples.code.chapter8

class Chapter8_9_3_3_II {

    var y = 1

    fun main() {
        ::y.set(2)
        println(y)
    }
}