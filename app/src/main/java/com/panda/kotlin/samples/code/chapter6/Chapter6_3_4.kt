package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class Chapter6_3_4 {
    fun main() {
        val time =
            measureTimeMillis {
                // 我们可以在协程外面启动异步执行
                val one = somethingUsefulOneAsync()
                val two = somethingUsefulTwoAsync()
                // 但是等待结果必须调用其它的挂起或者阻塞
                // 当我们等待结果的时候，这里我们使用'runBlocking { …… }'来阻塞主线程
                runBlocking { println("The answer is ${one.await() + two.await()}") }
            }
        println("Completed in $time ms")
    }
// sampleEnd

    fun somethingUsefulOneAsync() =
        GlobalScope.async { doSomethingUsefulOne() }

    fun somethingUsefulTwoAsync() =
        GlobalScope.async { doSomethingUsefulTwo() }

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