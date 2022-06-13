package com.panda.kotlin.samples.code.chapter3


@JvmInline
value class Hours(val value: Int)


class Chapter3_13_5_1_I {
    fun main() {
        val period = Hours(24)
    }
}