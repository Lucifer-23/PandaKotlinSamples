package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

class Chapter6_7_5_3 {

    fun main() = runBlocking {
        val handler = CoroutineExceptionHandler { _, exception ->
            println("Caught $exception")
        }
        supervisorScope {
            val child = launch(handler) {

                println("Child throws an exception")
                throw AssertionError()
            }

            println("Scope is completing")
        }

        println("Scope is completed")
    }
}