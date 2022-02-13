package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_2_3 {
    fun main() = runBlocking {
        // sampleStart
        val startTime = System.currentTimeMillis()

        val job = launch(Dispatchers.Default) {
            var nextPrintTime = startTime

            var i = 0
            // 可以被取消的计算循环
            while (isActive) {

                // 每秒打印消息两次
                if (System.currentTimeMillis() >= nextPrintTime) {
                    println("job: I'm sleeping ${i++} ...")
                    nextPrintTime += 500L
                }
            }
        }

        // 等待一段时间
        delay(1300L)

        println("main: I'm tired of waiting!")

        // 取消该作业并等待它结束
        job.cancelAndJoin()

        println("main: Now I can quit.")
        // sampleEnd
    }
}