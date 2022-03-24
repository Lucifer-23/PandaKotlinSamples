package com.panda.kotlin.samples.code.chapter1

import java.lang.IllegalArgumentException

class Chapter1_2_16 {
    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid value")
        }
    }

    fun main() {

    }
}