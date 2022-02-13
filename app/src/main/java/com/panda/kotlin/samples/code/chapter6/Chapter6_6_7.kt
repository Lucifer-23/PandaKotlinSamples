package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_6_7 {

    fun main() = runBlocking {
        val channel = Channel<String>()
        launch { sendString(channel, "foo", 200L) }
        launch { sendString(channel, "BAR!", 500L) }

        // 接收前六个
        repeat(6) {
            println(channel.receive())
        }

        // 取消所有子协程来让主协程结束
        coroutineContext.cancelChildren()
    }

    suspend fun sendString(
        channel: SendChannel<String>,
        s: String,
        time: Long
    ) {
        while (true) {
            delay(time)
            channel.send(s)
        }
    }
}