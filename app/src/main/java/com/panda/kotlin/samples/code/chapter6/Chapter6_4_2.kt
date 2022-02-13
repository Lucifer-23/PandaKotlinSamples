package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_4_2 {
    fun main() = runBlocking {
        // sampleStart
        launch(Dispatchers.Unconfined) {
            // 非受限的——将和主线程一起工作
            println(
                "Unconfined: I'm working in thread " +
                        "${Thread.currentThread().name}"
            )

            delay(500)

            println(
                "Unconfined: After delay in thread" +
                        "${Thread.currentThread().name}"
            )
        }

        launch {
            // 父协程的上下文，主runBlocking协程
            println(
                "main runBlocking: I'm working in thread " +
                        "${Thread.currentThread().name}"
            )

            delay(1000)

            println(
                "main runBlocking: After delay in thread " +
                        "${Thread.currentThread().name}"
            )
        }
        // sampleEnd
    }
}