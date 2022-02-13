package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

class Chapter6_8_3 {

    suspend fun massiveRun(action: suspend () -> Unit) {
        // 启动的协程数量
        val n = 100

        // 每个协程重复执行同一动作的次数
        val k = 1000

        val time = measureTimeMillis {
            coroutineScope {
                // 协程的作用域
                repeat(n) {
                    launch {
                        repeat(k) { action() }
                    }
                }
            }
        }

        println("Completed ${n * k} actions in $time ms")
    }

    var counter = AtomicInteger()

    fun main() = runBlocking {
        withContext(Dispatchers.Default) {
            massiveRun {
                counter.incrementAndGet()
            }
        }
        println("Counter = $counter")
    }
}