package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

class Chapter6_5_14_3 {

    // sampleStart
    fun foo(): Flow<Int> = (1..3).asFlow()

    fun main() = runBlocking<Unit> {
        foo().onCompletion { cause -> println("Flow completed with $cause") }
            .collect { value ->
                check(value <= 1) { "Collected $value" }
                println(value)
            }
    }
    // sampleEnd
}