package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_5_1_3_TEST {
    // sampleStart
    fun foo(): Flow<Int> = flow {
        // 流构建器
        for (i in 1..3) {
            // 假装我们在这里做了一些有用的事情
            Thread.sleep(100)

            // 发送下一个值
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        // 启动并发的协程以验证主线程并未阻塞
        launch {
            for (k in 1..3) {
                println("I'm not blocked $k")
                delay(100)
            }
        }
        // 收集这个流
        foo().collect { value -> println(value) }
    }
    // sampleEnd
}