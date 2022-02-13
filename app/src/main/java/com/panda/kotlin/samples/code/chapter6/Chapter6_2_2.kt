package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_2_2 {
    fun main() = runBlocking {
        // sampleStart
        val startTime = System.currentTimeMillis()

        val job = launch(Dispatchers.Default) {
            var nextPrintTime = startTime

            var i = 0
            // 一个执行计算的循环，只是为了占用CPU
            while (i < 5) {
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

        // 取消一个作业并且等待它结束
        job.cancelAndJoin()

        println("main: Now I can quit.")
        // sampleEnd
    }
}