package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_2_1 {
    fun main() = runBlocking {
        // sampleStart
        val job = launch {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }
        }

        // 延迟一段时间
        delay(1300L)

        println("main: I'm tired of waiting!")

        // 取消该作业
        job.cancel()

        // 等待作业执行结束
        job.join()

        println("main: Now I can quit.")
        // sampleEnd
    }
}