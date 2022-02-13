package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_4_3 {
    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

    fun main() = runBlocking {
        // sampleStart
        val a = async {
            log("I'm computing a piece of the answer")
            6
        }

        val b = async {
            log("I'm computing another piece of the answer")
            7
        }

        log("The answer is ${a.await() * b.await()}")
        // sampleEnd
    }
}