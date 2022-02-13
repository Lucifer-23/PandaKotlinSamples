package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_3 {
    fun main() = runBlocking {
        // sampleStart
        val job =
            GlobalScope.launch {
                // 启动一个新协程并保持对这个作业的引用
                delay(1000L)
                println("World!")
            }

        println("Hello,")

        // 等待直到子协程执行结束
        job.join()

        // sampleEnd
    }
}