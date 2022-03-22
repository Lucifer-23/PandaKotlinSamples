package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

class Chapter6_7_3_I {
    fun main() = runBlocking {
        val job = launch {
            val child = launch {
                try {
                    delay(Long.MAX_VALUE)
                } finally {
                    println("Child is cancelled")
                }
            }
            yield()

            println("Cancelling child")

            child.cancel()
            child.join()
            yield()

            println("Parent is not cancelled")
        }
        job.join()
    }
}