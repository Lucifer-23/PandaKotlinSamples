package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_4_10 {
    class Activity : CoroutineScope by CoroutineScope(Dispatchers.Default) {
        fun destroy() {
            cancel()
            // Extension on CoroutineScope
        } // 继续运行……

        // class Activity continues
        fun doSomething() {
            // 在示例中启动了10个协程，且每个都工作了不同的时长
            repeat(10) { i ->
                launch {
                    // 延迟200毫秒、400毫秒、600毫秒等等不同的时间
                    delay((i + 1) * 200L)

                    println("Coroutine $i is done")
                }
            }
        }
    } // Activity类结束

    fun main() = runBlocking {
        //sampleStart
        val activity = Activity()

        // 运行测试函数
        activity.doSomething()

        println("Launched coroutines")

        // 延迟半秒钟
        delay(500L)

        println("Destroying activity!")

        // 取消所有的协程
        activity.destroy()

        // 为了在视觉上确认它们没有工作

        delay(1000)
        // sampleEnd
    }
}