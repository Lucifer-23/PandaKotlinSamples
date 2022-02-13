package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_7 {
    fun main() = runBlocking {
        // 启动大量的协程
        repeat(100_000) {
            launch {
                delay(1000L)
                println(".")
            }
        }
    }
}