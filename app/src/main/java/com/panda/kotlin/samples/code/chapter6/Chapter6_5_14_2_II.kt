package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

class Chapter6_5_14_2_II {

    // sampleStart
    fun foo(): Flow<Int> = flow {
        emit(1)
        throw RuntimeException()
    }

    fun main() = runBlocking<Unit> {
        foo().onCompletion { cause ->
            if (cause != null) println("Flow completed exceptionally ")
        }.catch { cause -> println("Caught exception") }
            .collect { value -> println(value) }
    }
    // sampleEnd
}