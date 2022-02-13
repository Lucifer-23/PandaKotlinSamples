package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.selects.select

class Chapter6_9_3 {

    fun CoroutineScope.produceNumbers(side: SendChannel<Int>) = produce<Int> {
        // 生产从1到10的10个数值
        for (num in 1..10) {
            // 延迟100毫秒
            delay(100)

            select<Unit> {
                // 发送到主通道
                onSend(num) {}

                // 或者发送到side通道
                side.onSend(num) {}
            }
        }
    }

    fun main() = runBlocking<Unit> {
        // 分配side通道
        val side = Channel<Int>()

        launch {
            // 对于side通道来说，这是一个很快的消费者
            side.consumeEach { println("Side channel has $it") }
        }

        produceNumbers(side).consumeEach {
            println("Consuming $it")
            // 不要着急，让我们正确消化消耗被发送来的数字
            delay(250)
        }

        println("Done consuming")

        coroutineContext.cancelChildren()
    }
}