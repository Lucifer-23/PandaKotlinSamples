package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class Chapter6_5_1_2 {
    // sampleStart
    suspend fun foo(): List<Int> {
        // 假装我们在这里做了一些异步的事情
        delay(1000)

        return listOf(1, 2, 3)
    }

    fun main() = runBlocking<Unit> {
        foo().forEach { value -> println(value) }
    }
    // sampleEnd
}