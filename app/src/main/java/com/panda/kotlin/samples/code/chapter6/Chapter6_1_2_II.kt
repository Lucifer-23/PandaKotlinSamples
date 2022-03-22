package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_2_II {
    // 开始执行主协程
    fun main() = runBlocking {

        // 在后台启动一个新的协程并继续
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }

        // 主协程在这里会立即执行
        println("Hello,")

        // 延迟2秒来保证JVM存活
        delay(2000L)
    }
}