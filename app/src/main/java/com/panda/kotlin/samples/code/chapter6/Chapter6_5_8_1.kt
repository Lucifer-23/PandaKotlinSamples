package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

class Chapter6_5_8_1 {
    // sampleStart
    fun foo(): Flow<Int> = flow {
        // 在流构建器中更改消耗CPU代码的上下文的错误方式
        kotlinx.coroutines.withContext(Dispatchers.Default) {
            for (i in 1..3) {
                // 假装我们以消耗CPU的方式进行计算
                Thread.sleep(100)
                // 发射下一个值
                emit(i)
            }
        }
    }

    fun main() = runBlocking<Unit> {
        foo().collect { value -> println(value) }
    }
    // sampleEnd
}