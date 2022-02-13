package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

class Chapter6_5_13 {
    fun foo(): Flow<String> = flow {
        for (i in 1..3) {
            println("Emitting $i")
            // 发射下一个值
            emit(i)
        }
    }.map { value ->
        check(value <= 1) { "Crashed on $value" }
        "string $value"
    }

    fun main() = runBlocking<Unit> {
        // sampleStart
        // 发射一个异常
        foo().catch { e -> emit("Caught $e") }
            .collect { value -> println(value) }
        // sampleEnd
    }
}