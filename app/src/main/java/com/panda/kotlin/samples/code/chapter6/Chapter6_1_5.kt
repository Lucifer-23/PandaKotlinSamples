package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_5 {
    fun main() = runBlocking {
        // this: CoroutineScope
        launch {
            delay(200L)
            println("Task from runBlocking")
        }

        coroutineScope {
            // 创建一个协程作用域
            launch {
                delay(500L)
                println("Task from nested launch")
            }

            delay(100L)

            // 这一行会在内嵌launch之前输出
            println("Task from coroutine scope")
        }

        // 这一行在内嵌launch执行完毕后才输出
        println("Coroutine scope is over")
    }
}