package com.panda.kotlin.samples.code.chapter6

import kotlin.concurrent.thread

class Chapter6_1_1_II {
    fun main() {
        // 在后台启动一个新的协程并继续
        thread {

            // 非阻塞的等待1秒钟(默认时间单位是毫秒)
            Thread.sleep(1000L)

            // 在延迟后打印输出
            println("World!")
        }

        // 协程已在等待时主线程还在继续
        println("Hello,")

        // 阻塞主线程2秒钟来保证JVM存活
        Thread.sleep(2000L)
    }
}