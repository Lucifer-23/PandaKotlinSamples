package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

class Chapter6_5_12_1 {

    // sampleStart
    fun foo(): Flow<Int> = flow {
        for (i in 1..3) {
            println("Emitting $i")
            // 发射下一个值
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        try {
            foo().collect { value ->
                println(value)
                check(value <= 1) { "Collected $value" }
            }
        } catch (e: Throwable) {
            println("Caught $e")
        }
    }
    // sampleEnd
}