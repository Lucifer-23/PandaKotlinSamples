package com.panda.kotlin.samples.code.chapter8

val String.lastChar: Char
    get() = this[length - 1]

class Chapter8_9_3_3_FIVE {

    fun main() {
        println(String::lastChar.get("abc"))
    }
}