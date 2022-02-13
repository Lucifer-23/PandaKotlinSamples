package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_1_1 {

    fun main() {
        val str = "Hello"
        // this
        str.run {
            println("The receiver string length: $length")

            // 和上句效果相同
            // println("The receiver string length: ${this.length}")
        }

        // it
        str.let {
            println("The receiver string's length is ${it.length}")
        }
    }
}