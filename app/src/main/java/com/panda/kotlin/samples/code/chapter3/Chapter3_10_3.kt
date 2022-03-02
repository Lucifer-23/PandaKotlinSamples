package com.panda.kotlin.samples.code.chapter3

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

class Chapter3_10_3 {

    enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
        PLUS {
            override fun apply(t: Int, u: Int): Int = t + u
        },
        TIMES {
            override fun apply(t: Int, u: Int): Int = t * u
        };

        override fun applyAsInt(t: Int, u: Int): Int = apply(t, u)
    }

    fun main() {
        val a = 13
        val b = 31
        for (f in IntArithmetics.values()) {
            println("$f($a, $b) = ${f.applyAsInt(a, b)}")
        }
    }
}