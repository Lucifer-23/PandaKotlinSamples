package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

class Chapter6_5_4 {
    fun main() = runBlocking<Unit> {
        // sampleStart
        // 将一个整数区间转化为流
        (1..3).asFlow().collect { value -> println(value) }
        // sampleEnd
    }
}