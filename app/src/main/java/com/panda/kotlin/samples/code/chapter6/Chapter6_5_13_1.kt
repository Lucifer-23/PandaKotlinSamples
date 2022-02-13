package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

class Chapter6_5_13_1 {

    // sampleStart
    fun foo(): Flow<Int> = flow {
        for (i in 1..3) {
            println("Emitting $i")
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        // 不会捕获下游异常
        foo().catch { e -> println("Caught $e") }
            .collect { value ->
                check(value <= 1) { "Collected $value" }
                println(value)
            }
    }
    // sampleEnd
}