package com.panda.kotlin.samples.code.chapter8

import kotlin.random.Random

class Chapter8_10_1_1_2_I {

    fun writeToLog(message: String) {
        println("INFO: $message")
    }

    fun main() {
        fun getRandomInt(): Int {
            return Random.nextInt(100).also {
                writeToLog("getRandomInt() generated value $it")
            }
        }

        val i = getRandomInt()
    }
}