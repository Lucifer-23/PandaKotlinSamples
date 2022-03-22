package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class Chapter6_3_5_I {
    fun main() = runBlocking {
        // sampleStart
        val time = measureTimeMillis {
            println("The answer is ${concurrentSum()}")
        }

        println("Completed in $time ms")
        // sampleEnd
    }

    suspend fun concurrentSum(): Int =
        coroutineScope {
            val one = async {
                doSomethingUsefulOne()
            }

            val two = async {
                doSomethingUsefulTwo()
            }

            one.await() + two.await()
        }

    suspend fun doSomethingUsefulOne(): Int {

        // 假设我们在这里做了些有用的事
        delay(1000L)

        return 13
    }

    suspend fun doSomethingUsefulTwo(): Int {

        // 假设我们在这里也做了些有用的事
        delay(1000L)

        return 29
    }
}