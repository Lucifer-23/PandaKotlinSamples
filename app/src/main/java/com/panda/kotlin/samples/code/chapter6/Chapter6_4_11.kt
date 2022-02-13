package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*

class Chapter6_4_11 {
    // 声明线程局部变量
    val threadLocal = ThreadLocal<Any>()

    fun main() = runBlocking {
        // sampleStart
        threadLocal.set("main")
        println(
            "Pre-main, current thread: ${Thread.currentThread()}, " +
                    "thread local value: '${threadLocal.get()}'"
        )

        val job = launch(
            Dispatchers.Default
                    + threadLocal.asContextElement(value = "launch")
        ) {
            println(
                "Launch start, current thread: ${Thread.currentThread()}," +
                        " thread local value:'${threadLocal.get()}'"
            )

            yield()

            println(
                "After yield, current thread: ${Thread.currentThread()}, " +
                        "thread local value: '${threadLocal.get()}'"
            )
        }

        job.join()

        println(
            "Post-main, current thread: ${Thread.currentThread()}," +
                    " thread local value: '${threadLocal.get()}'"
        )
        // sampleEnd
    }
}