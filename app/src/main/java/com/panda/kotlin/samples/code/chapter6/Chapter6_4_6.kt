package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_4_6 {
    fun main() = runBlocking {
        //sampleStart
        // 启动一个协程来处理某种传入请求(request)
        val request = launch {

            // 孵化了两个子作业, 其中一个通过GlobalScope启动
            GlobalScope.launch {
                println(
                    "job1: I run in GlobalScope and " +
                            "execute independently !"
                )
                delay(1000)
                println(
                    "job1: I am not affected by cancellation " +
                            "of the request"
                )
            }

            // 另一个则承袭了父协程的上下文
            launch {
                delay(100)
                println("job2: I am a child of the request coroutine")
                delay(1000)
                println(
                    "job2: I will not execute this line " +
                            "if my parent request is cancelled"
                )
            }
        }

        delay(500)

        // 取消请求(request)的执行
        request.cancel()

        // 延迟一秒钟来看看发生了什么
        delay(1000)

        println("main: Who has survived request cancellation?")
        // sampleEnd
    }
}