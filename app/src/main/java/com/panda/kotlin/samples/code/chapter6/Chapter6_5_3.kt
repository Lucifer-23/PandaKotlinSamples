package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

class Chapter6_5_3 {
    // sampleStart
    fun foo(): Flow<Int> = flow {
        for (i in 1..3) {
            delay(100)
            println("Emitting $i")
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        withTimeoutOrNull(250) {
            // 在250毫秒后超时
            foo().collect { value -> println(value) }
        }

        println("Done")
    }
    // sampleEnd
}