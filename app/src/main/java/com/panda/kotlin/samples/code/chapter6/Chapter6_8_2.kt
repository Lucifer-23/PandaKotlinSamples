package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class Chapter6_8_2 {

    suspend fun massiveRun(action: suspend () -> Unit) {
        // 启动的协程数量
        val n = 100

        // 每个协程重复执行同一动作的次数
        val k = 1000
        val time = measureTimeMillis {
            // 协程的作用域
            coroutineScope {
                repeat(n) {
                    launch {
                        repeat(k) { action() }
                    }
                }
            }
        }
        println("Completed ${n * k} actions in $time ms")
    }

    // 在Kotlin中'volatile'是一个注解
    @Volatile
    var counter = 0

    fun main() = runBlocking {
        withContext(Dispatchers.Default) {
            massiveRun {
                counter++
            }
        }
        println("Counter = $counter")
    }
}