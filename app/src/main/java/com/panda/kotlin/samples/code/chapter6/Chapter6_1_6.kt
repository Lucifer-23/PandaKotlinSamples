package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_6 {
    fun main() = runBlocking {
        launch {
            doWorld()
        }

        println("Hello,")
    }

    // 这是你的第一个挂起函数
    suspend fun doWorld() {
        delay(1000L)
        println("World!")
    }
}