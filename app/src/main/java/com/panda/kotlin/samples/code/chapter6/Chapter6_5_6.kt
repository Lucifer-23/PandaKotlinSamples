package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

class Chapter6_5_6 {
    fun main() = runBlocking<Unit> {
        // sampleStart
        val sum = (1..5).asFlow()
            // 数字1至5的平方
            .map { it * it }
            // 求和(末端操作符)
            .reduce { a, b -> a + b }

        println(sum)
        // sampleEnd
    }
}