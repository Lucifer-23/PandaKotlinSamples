package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

class Chapter6_2_6_II {
    fun main() = runBlocking {
        // sampleStart
        val result =
            withTimeoutOrNull(1300L) {
                repeat(1000) { i ->
                    println("I'm sleeping $i ...")
                    delay(500L)
                }
                // 在它运行得到结果之前取消它
                "Done"
            }

        println("Result is $result")
        // sampleEnd
    }
}