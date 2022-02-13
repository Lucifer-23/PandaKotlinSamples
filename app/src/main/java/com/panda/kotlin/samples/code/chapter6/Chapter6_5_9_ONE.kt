package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class Chapter6_5_9_ONE {
    // sampleStart
    fun foo(): Flow<Int> = flow {
        for (i in 1..3) {
            // 假装我们异步等待了100毫秒
            delay(100)
            // 发射下一个值
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        val time = measureTimeMillis {
            foo().collect { value ->
                // 假装我们花费300毫秒来处理它
                delay(300)
                println(value)
            }
        }
        println("Collected in $time ms")
    }
    // sampleEnd
}