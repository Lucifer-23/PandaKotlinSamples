package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_7_5_2 {

    fun main() = runBlocking {
        try {
            supervisorScope {
                val child = launch {
                    try {
                        println("Child is sleeping")
                        delay(Long.MAX_VALUE)
                    } finally {
                        println("Child is cancelled")
                    }
                }

                // 使用yield来给我们的子作业一个机会来执行打印
                yield()
                println("Throwing exception from scope")
                throw AssertionError()
            }
        } catch (e: AssertionError) {
            println("Caught assertion error")
        }
    }
}