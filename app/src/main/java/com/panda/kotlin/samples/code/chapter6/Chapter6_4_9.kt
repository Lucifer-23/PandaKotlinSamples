package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_4_9 {
    fun main() = runBlocking {
        // sampleStart
        launch(Dispatchers.Default + CoroutineName("test")) {
            println(
                "I'm working in thread " +
                        "${Thread.currentThread().name}"
            )
        }
        // sampleEnd
    }
}