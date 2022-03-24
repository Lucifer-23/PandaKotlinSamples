package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_6 {
    class Foo

    class Bar

    fun main() {
        val x: Any = Bar()

        when (x) {
            is Foo -> {}
            is Bar -> {}
            else -> {}
        }
    }
}