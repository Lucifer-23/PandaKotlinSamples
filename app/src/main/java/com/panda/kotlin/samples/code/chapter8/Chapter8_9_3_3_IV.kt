package com.panda.kotlin.samples.code.chapter8

class Chapter8_9_3_3_IV {

    fun main() {
        class A(val p: Int)

        val prop = A::p
        println(prop.get(A(1)))
    }
}