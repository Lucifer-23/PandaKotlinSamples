package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_1_8 {
    fun main() = runBlocking {
        // sampleStart
        GlobalScope.launch {
            repeat(1000)
            { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        }

        // 在延迟后退出
        delay(1300L)
        // sampleEnd
    }
}