package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

class Chapter6_5_11_2 {

    fun requestFlow(i: Int): Flow<String> = flow {
        emit("$i: First")
        // 等待500毫秒
        delay(500)
        emit("$i: Second")
    }

    fun main() = runBlocking<Unit> {
        // sampleStart
        // 记录开始的时间
        val startTime = System.currentTimeMillis()
        // 每100毫秒发射一次字符串
        (1..3).asFlow().onEach { delay(100) }
            .flatMapMerge { requestFlow(it) }
            .collect { value ->
                // 收集并打印
                val tempTime = System.currentTimeMillis() - startTime
                println(
                    "$value at $tempTime ms from start"
                )
            }
        // sampleEnd
    }
}