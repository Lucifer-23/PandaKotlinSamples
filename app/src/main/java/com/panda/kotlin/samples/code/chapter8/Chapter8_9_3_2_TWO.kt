package com.panda.kotlin.samples.code.chapter8

class Chapter8_9_3_2_TWO {

    fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
        return { x -> f(g(x)) }
    }

    fun isOdd(x: Int) = x % 2 != 0

    fun main() {
        fun length(s: String) = s.length

        val oddLength = compose(::isOdd, ::length)
        val strings = listOf("a", "ab", "abc")

        println(strings.filter(oddLength))
    }
}