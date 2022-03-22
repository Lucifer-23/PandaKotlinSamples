package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

class Chapter6_1_7_TEST {
    fun main() = runBlocking {
        // 启动大量的协程
        repeat(100_000) {
            thread {
                Thread.sleep(1000L)
                println(".")
            }
        }
    }
}