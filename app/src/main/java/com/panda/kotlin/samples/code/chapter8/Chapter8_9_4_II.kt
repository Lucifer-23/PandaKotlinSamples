package com.panda.kotlin.samples.code.chapter8

class Chapter8_9_4_II {

    fun main() {
        val numberRegex = "\\d+".toRegex()
        val strings = listOf("abc", "124", "a70")
        println(strings.filter(numberRegex::matches))
    }
}