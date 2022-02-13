package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_6_8 {

    fun main() = runBlocking<Unit> {
        // 启动带缓冲的通道
        val channel = Channel<Int>(4)

        // 启动发送者协程
        val sender = launch {
            repeat(10) {
                // 在每一个元素发送前打印它们
                println("Sending $it")

                // 将在缓冲区被占满时挂起
                channel.send(it)
            }
        }

        // 没有接收到东西……只是等待……
        delay(1000)

        // 取消发送者协程
        sender.cancel()
    }
}