package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class Chapter6_4_4 {
    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

    fun main() {
        // sampleStart
        newSingleThreadContext("Ctx1").use { ctx1 ->
            newSingleThreadContext("Ctx2").use { ctx2 ->
                runBlocking(ctx1) {
                    log("Started in ctx1")

                    withContext(ctx2) {
                        log("Working in ctx2")
                    }

                    log("Back to ctx1")
                }
            }
        }
        // sampleEnd
    }
}