package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

class Chapter6_5_10_2_TWO {

    fun main() = runBlocking<Unit> {
        // sampleStart
        // 发射数字1..3，间隔 300 毫秒
        val nums = (1..3).asFlow().onEach { delay(300) }

        // 每400毫秒发射一次字符串
        val strs = flowOf("one", "two", "three").onEach { delay(400) }

        // 记录开始的时间
        val startTime = System.currentTimeMillis()

        // 使用"combine"组合单个字符串
        nums.combine(strs) { a, b -> "$a -> $b" }
            .collect { value ->
                // 收集并打印
                val tempTime = System.currentTimeMillis() - startTime
                println(
                    "$value at $tempTime ms from start"
                )
            }
        // sampleEnd
    }
}