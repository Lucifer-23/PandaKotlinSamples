package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking

class Chapter6_5_10_1 {

    fun main() = runBlocking<Unit> {
        // sampleStart
        // 数字 1..3
        val nums = (1..3).asFlow()

        // 字符串
        val strs = flowOf("one", "two", "three")

        // 组合单个字符串
        nums.zip(strs) { a, b -> "$a -> $b" }
            // 收集并打印
            .collect { println(it) }
        // sampleEnd
    }
}