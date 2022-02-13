package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class Chapter6_3_3 {
    fun main() = runBlocking {
        // sampleStart
        val time = measureTimeMillis {
            // 执行一些计算
            val one = async(start = CoroutineStart.LAZY) {
                doSomethingUsefulOne()
            }

            val two = async(start = CoroutineStart.LAZY) {
                doSomethingUsefulTwo()
            }

            // 启动第一个
            one.start()

            // 启动第二个
            two.start()

            println("The answer is ${one.await() + two.await()}")
        }

        println("Completed in $time ms")
        // sampleEnd
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