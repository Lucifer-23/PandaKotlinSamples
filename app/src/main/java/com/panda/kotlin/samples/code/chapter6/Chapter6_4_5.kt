package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking

class Chapter6_4_5 {
    fun main() = runBlocking {
        // sampleStart
        println("My job is ${coroutineContext[Job]}")
        // sampleEnd
    }
}