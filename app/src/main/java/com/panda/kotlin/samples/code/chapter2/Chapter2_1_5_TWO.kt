package com.panda.kotlin.samples.code.chapter2

import java.lang.IllegalArgumentException

class Chapter2_1_5_TWO {

    fun main() {

    }

    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9') {
            throw IllegalArgumentException("Out of range")
        }

        return c.toInt() - '0'.toInt()
    }
}