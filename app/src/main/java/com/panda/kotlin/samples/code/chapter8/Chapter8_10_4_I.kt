package com.panda.kotlin.samples.code.chapter8

import kotlin.random.Random

class Chapter8_10_4_I {

    fun main() {
        val number = Random.nextInt(100)

        val evenOrNull = number.takeIf { it % 2 == 0 }
        val oddOrNull = number.takeUnless { it % 2 == 0 }
        println("even: $evenOrNull, odd: $oddOrNull")
    }
}