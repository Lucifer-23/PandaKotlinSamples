package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_17 {
    fun count() {

    }

    fun test() {
        val result = try {
            count()
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }
        // 使用result
    }

    fun main() {

    }
}