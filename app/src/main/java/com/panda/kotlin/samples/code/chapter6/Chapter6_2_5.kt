package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_2_5 {
    fun main() = runBlocking {
        // sampleStart
        val job = launch {
            try {
                repeat(1000) { i ->
                    println("job: I'm sleeping $i ...")
                    delay(500L)
                }
            } finally {
                withContext(NonCancellable) {

                    println("job: I'm running finally")

                    delay(1000L)

                    println(
                        "job: And I've just delayed for 1 sec " +
                                "because I'm non-cancellable"
                    )
                }
            }
        }

        // 延迟一段时间
        delay(1300L)

        println("main: I'm tired of waiting!")

        // 取消该作业并等待它结束
        job.cancelAndJoin()

        println("main: Now I can quit.")
        // sampleEnd
    }
}