package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_3_TWO {

    fun main() {
        val hexNumberRegex = run {
            val digits = "0-9"
            val hexDigits = "A-Fa-f"
            val sign = "+-"

            Regex("[$sign]?[$digits$hexDigits]+")
        }

        for (match in hexNumberRegex.findAll("+1234 -FFFF not-a-number")) {
            println(match.value)
        }
    }
}