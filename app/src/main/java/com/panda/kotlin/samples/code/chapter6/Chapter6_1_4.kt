package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_4 {
    fun main() = runBlocking {
        // this: CoroutineScope
        launch { // 在runBlocking作用域中启动一个新协程
            delay(1000L)

            println("World!")
        }

        println("Hello,")
    }
}