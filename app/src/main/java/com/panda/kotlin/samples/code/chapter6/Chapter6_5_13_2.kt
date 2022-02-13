package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

class Chapter6_5_13_2 {

    fun foo(): Flow<Int> = flow {
        for (i in 1..3) {
            println("Emitting $i")
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        // sampleStart
        foo().onEach { value ->
            check(value <= 1) { "Collected $value" }
            println(value)
        }.catch { e -> println("Caught $e") }
            .collect()
        // sampleEnd
    }
}