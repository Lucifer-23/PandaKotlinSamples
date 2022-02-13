package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

class Chapter6_5_16_ONE {
    // sampleStart
    // 模拟一个event流
    fun events(): Flow<Int> = (1..3).asFlow().onEach { delay(100) }

    fun main() = runBlocking<Unit> {
        events().onEach { event -> println("Event: $event") }
            .collect() // <--- 在单独的协程中执行流
        println("Done")
    }
    // sampleEnd
}