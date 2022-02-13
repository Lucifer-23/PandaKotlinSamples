package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class Chapter6_4_8 {
    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

    fun main() = runBlocking(CoroutineName("main")) {
        // sampleStart
        log("Started main coroutine")

        // 运行两个后台值计算
        val v1 = async(CoroutineName("v1coroutine")) {
            delay(500)
            log("Computing v1")
            252
        }

        val v2 = async(CoroutineName("v2coroutine")) {
            delay(1000)
            log("Computing v2")
            6
        }

        log("The answer for v1 / v2 = ${v1.await() / v2.await()}")
        // sampleEnd
    }
}