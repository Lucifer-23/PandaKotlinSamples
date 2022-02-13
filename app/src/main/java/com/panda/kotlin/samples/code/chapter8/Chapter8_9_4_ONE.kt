package com.panda.kotlin.samples.code.chapter8

class Chapter8_9_4_ONE {

    fun main() {
        val numberRegex = "\\d+".toRegex()
        println(numberRegex.matches("29"))

        val isNumber = numberRegex::matches
        println(isNumber("29"))
    }
}