package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class Chapter6_5_9_2 {
    fun foo(): Flow<Int> = flow {
        for (i in 1..3) {
            // 假装我们异步等待了100毫秒
            delay(100)
            // 发射下一个值
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        //sampleStart
        val time = measureTimeMillis {
            foo().collectLatest { value ->
                // 取消并重新发射最后一个值
                println("Collecting $value")
                // 假装我们花费300毫秒来处理它
                delay(300)
                println("Done $value")
            }
        }
        println("Collected in $time ms")
        // sampleEnd
    }
}