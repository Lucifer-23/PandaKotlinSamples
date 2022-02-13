package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_2_4 {
    fun main() = runBlocking {
        // sampleStart
        val job = launch {
            try {
                repeat(1000) { i ->
                    println("job: I'm sleeping $i ...")
                    delay(500L)
                }
            } finally {
                println("job: I'm running finally")
            }
        }

        // 延迟一段时间
        delay(1300L)

        println("main: I 'm tired of waiting!")

        // 取消该作业并且等待它结束
        job.cancelAndJoin()

        println("main: Now I can quit.")
        // sampleEnd
    }
}