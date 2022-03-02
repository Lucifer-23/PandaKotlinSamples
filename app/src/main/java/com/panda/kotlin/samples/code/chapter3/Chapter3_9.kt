package com.panda.kotlin.samples.code.chapter3

class Chapter3_9 {

    class Outer {
        private val bar: Int = 1

        class Nested {
            fun foo() = 2
        }
    }

    val demo = Outer.Nested().foo() // == 2

    fun main() {
    }
}