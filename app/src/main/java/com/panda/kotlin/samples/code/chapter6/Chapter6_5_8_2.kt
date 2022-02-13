package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.runBlocking

class Chapter6_5_8_2 {
    fun log(msg: String) =
        println("[${Thread.currentThread().name}] $msg")

    // sampleStart
    fun foo(): Flow<Int> = flow {
        for (i in 1..3) {
            // 假装我们以消耗CPU的方式进行计算
            Thread.sleep(100)
            log("Emitting $i")
            // 发射下一个值
            emit(i)
        }
// 在流构建器中改变消耗CPU代码上下文的正确方式
    }.flowOn(Dispatchers.Default)

    fun main() = runBlocking<Unit> {
        foo().collect { value ->
            log("Collected $value")
        }
    }
    // sampleEnd
}