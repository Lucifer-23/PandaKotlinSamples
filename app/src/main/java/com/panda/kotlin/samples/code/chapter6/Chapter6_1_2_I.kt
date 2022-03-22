package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_2_I {
    fun main() {
        // 在后台启动一个新的协程并继续
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        // 主线程中的代码会立即执行
        println("Hello,")

        // 但是这个表达式阻塞了主线程
        runBlocking {

            // ……我们延迟2秒来保证JVM的存活
            delay(2000L)
        }
    }
}