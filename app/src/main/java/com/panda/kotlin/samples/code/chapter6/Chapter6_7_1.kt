package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_7_1 {
    fun main() = runBlocking {
        val job = GlobalScope.launch {
            println("Throwing exception from launch")
            // 我们将在控制台打印 Thread.defaultUncaughtExceptionHandler
            throw IndexOutOfBoundsException()
        }

        job.join()

        println("Joined failed job")

        val deferred = GlobalScope.async {
            println("Throwing exception from async")

            // 没有打印任何东西，依赖用户去调用等待
            throw ArithmeticException()
        }

        try {
            deferred.await()
            println("Unreached")
        } catch (e: ArithmeticException) {
            println("Caught ArithmeticException")
        }
    }
}