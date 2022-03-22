package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Chapter6_1_1_I {

    fun main() {
        // 在后台启动一个新的协程并继续
        GlobalScope.launch {

            // 非阻塞的等待1秒钟(默认时间单位是毫秒)
            delay(1000L)

            // 在延迟后打印输出
            println("World!")
        }

        // 协程已在等待时主线程还在继续
        println("Hello,")

        // 阻塞主线程2秒钟来保证JVM存活
        Thread.sleep(2000L)
    }
}