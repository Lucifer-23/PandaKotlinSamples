package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_26 {

    fun main() {
        var a = 1
        var b = 2
        a = b.also { b = a }
    }
}