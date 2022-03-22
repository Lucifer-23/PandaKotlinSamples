package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

class Chapter6_2_6_I {
    fun main() = runBlocking {
        // sampleStart
        withTimeout(1300L) {
            repeat(1000) { i ->

                println("I'm sleeping $i ...")

                delay(500L)
            }
        }
        // sampleEnd
    }
}