package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

class Chapter6_5_12_2 {

    // sampleStart
    // sampleStart
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
        try {
            foo().collect { value -> println(value) }
        } catch (e: Throwable) {
            println("Caught $e")
        }
    }
    // sampleEnd
}