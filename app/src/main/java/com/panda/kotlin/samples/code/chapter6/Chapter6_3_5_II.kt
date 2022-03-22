package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class Chapter6_3_5_II {
    fun main() = runBlocking {
        try {
            failedConcurrentSum()
        } catch (e: ArithmeticException) {
            println("Computation failed with ArithmeticException")
        }
    }

    suspend fun failedConcurrentSum(): Int = coroutineScope {
        val one = async {
            try {

                // 模拟一个长时间的运算
                delay(Long.MAX_VALUE)

                42
            } finally {
                println("First child was cancelled")
            }
        }

        val two = async {
            println("Second child throws an exception")
            throw ArithmeticException()
            17
        }

        one.await() + two.await()
    }
}