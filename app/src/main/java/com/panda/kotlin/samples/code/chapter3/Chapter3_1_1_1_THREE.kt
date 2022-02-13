package com.panda.kotlin.samples.code.chapter3

class Chapter3_1_1_1_THREE {
    class InitOrderDemo(name: String) {
        val firstProperty = "First property: $name".also(::println)

        init {
            println("First initializer block that prints ${name}")
        }

        val secondProperty = "2nd property: ${name.length}".also(::println)

        init {
            println("Second initializer block that prints ${name.length}")
        }
    }

    fun main() {
        InitOrderDemo("hello")
    }
}