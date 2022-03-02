package com.panda.kotlin.samples.code.chapter3

class Chapter3_10_4_TWO {

    enum class RGB { RED, GREEN, BLUE}

    inline fun <reified T : Enum<T>> printAllValues() {
        print(enumValues<T>().joinToString { it.name })
        println()
    }

    fun main() {
        printAllValues<RGB>()
    }
}