package com.panda.kotlin.samples.code.chapter8

import kotlin.random.Random

class Chapter8_10_1_1_2_II {

    fun writeToLog(message: String) {
        println("INFO: $message")
    }

    fun main() {
        fun getRandomInt(): Int {
            return Random.nextInt(100).also { value ->
                writeToLog("getRandomInt() generated value $value")
            }
        }

        val i = getRandomInt()
    }
}