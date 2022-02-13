package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

class Chapter6_5_8 {
    fun log(msg: String) =
        println("[${Thread.currentThread().name}] $msg")

    // sampleStart
    fun foo(): Flow<Int> = flow {
        log("Started foo flow")
        for (i in 1..3) {
            emit(i)
        }
    }

    fun main() = runBlocking<Unit> {
        foo().collect { value -> log("Collected $value") }
    }
    // sampleEnd
}