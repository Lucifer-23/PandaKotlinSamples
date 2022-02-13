package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

class Chapter6_5_5_1 {
    suspend fun performRequest(request: Int): String {
        // 模仿长时间运行的异步任务
        delay(1000)
        return "response $request"
    }

    fun main() = runBlocking<Unit> {
        // sampleStart
        // 一个请求流
        (1..3).asFlow()
            .transform { request ->
                emit("Making request $request")
                emit(performRequest(request))
            }
            .collect { response -> println(response) }
        // sampleEnd
    }
}