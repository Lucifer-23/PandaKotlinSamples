package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_7_3_II {
    fun main() = runBlocking {
        val handler = CoroutineExceptionHandler { _, exception ->
            println("Caught $exception")
        }

        val job = GlobalScope.launch(handler) {
            // 第一个子协程
            launch {
                try {
                    delay(Long.MAX_VALUE)
                } finally {
                    withContext(NonCancellable) {
                        println(
                            "Children are cancelled, but exception " +
                                    "is not handled until all children terminate"
                        )
                        delay(100)
                        println("The first child finished its non cancellable block")
                    }
                }
            }

            // 第二个子协程
            launch {
                delay(10)
                println("Second child throws an exception")
                throw ArithmeticException()
            }
        }

        job.join()
    }
}