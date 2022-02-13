package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

class Chapter6_5_5_2 {
    // sampleStart
    fun numbers(): Flow<Int> = flow {
        try {
            emit(1)
            emit(2)
            println("This line will not execute")
            emit(3)
        } finally {
            println("Finally in numbers")
        }
    }

    fun main() = runBlocking<Unit> {
        numbers()
            // 只获取前两个
            .take(2)
            .collect { value -> println(value) }
    }
    // sampleEnd
}