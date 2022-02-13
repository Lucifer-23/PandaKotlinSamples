package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_6_6 {

    fun main() = runBlocking<Unit> {
        val producer = produceNumbers()
        repeat(5) { launchProcessor(it, producer) }
        delay(950)

        // 取消协程生产者从而将它们全部杀死
        producer.cancel()
    }

    fun CoroutineScope.produceNumbers() = produce<Int> {
        // 从1开始
        var x = 1
        while (true) {
            // 产生下一个数字
            send(x++)
            // 等待0.1秒
            delay(100)
        }
    }

    fun CoroutineScope.launchProcessor(
        id: Int,
        channel: ReceiveChannel<Int>
    ) = launch {
        for (msg in channel) {
            println("Processor #$id received $msg")
        }
    }
}