package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_8_TEST {
    fun foo() {
        val testString = "test"
        testString.run {
            this.equals("test")
            return@run
            println("test")
        }
        println("End")
    }

    fun main() {
        foo()
    }
}