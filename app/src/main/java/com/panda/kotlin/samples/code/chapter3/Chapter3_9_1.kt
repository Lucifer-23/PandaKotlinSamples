package com.panda.kotlin.samples.code.chapter3

class Chapter3_9_1 {

    class Outer {
        private val bar: Int = 1

        inner class Inner {
            fun foo() = bar
        }
    }

    val demo = Outer().Inner().foo() // == 1

    fun main() {
    }
}