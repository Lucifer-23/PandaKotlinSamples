package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

class Chapter6_5_14_1 {

    // sampleStart
    fun foo(): Flow<Int> = (1..3).asFlow()

    fun main() = runBlocking<Unit> {
        try {
            foo().collect { value -> println(value) }
        } finally {
            println("Done")
        }
    }
    // sampleEnd
}