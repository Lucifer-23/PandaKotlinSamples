package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_7_2 {
    fun main() = runBlocking {
        val handler = CoroutineExceptionHandler { _, exception ->
            println("Caught $exception")
        }

        val job = GlobalScope.launch(handler) {
            throw AssertionError()
        }

        val deferred = GlobalScope.async(handler) {
            // 没有打印任何东西，依赖用户去调用 deferred.await()
            throw ArithmeticException()
        }

        joinAll(job, deferred)
    }
}