package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.selects.select

class Chapter6_9_5 {

    fun CoroutineScope.switchMapDeferreds(
        input:
        ReceiveChannel<Deferred<String>>
    ) = produce<String> {
        // 从第一个接收到的延迟值开始
        var current = input.receive()

        // 循环直到被取消或关闭
        while (isActive) {
            val next = select<Deferred<String>?> {
                // 从这个select中返回下一个延迟值或null
                input.onReceiveOrNull { update ->
                    // 替换下一个要等待的值
                    update
                }
                current.onAwait { value ->
                    // 发送当前延迟生成的值
                    send(value)

                    // 然后使用从输入通道得到的下一个延迟值
                    input.receiveOrNull()
                }
            }

            if (next == null) {
                println("Channel was closed")
                // 跳出循环
                break
            } else {
                current = next
            }
        }
    }

    fun CoroutineScope.asyncString(
        str: String,
        time: Long
    ) = async {
        delay(time)
        str
    }

    fun main() = runBlocking<Unit> {
        // 测试使用的通道
        val chan = Channel<Deferred<String>>()

        // 启动打印协程
        launch {
            for (s in switchMapDeferreds(chan))
            // 打印每个获得的字符串
                println(s)
        }

        chan.send(asyncString("BEGIN", 100))
        // 充足的时间来生产"BEGIN"
        delay(200)

        chan.send(asyncString("Slow", 500))
        // 不充足的时间来生产"Slow"
        delay(100)

        chan.send(asyncString("Replace", 100))
        // 在最后一个前给它一点时间
        delay(500)

        chan.send(asyncString("END", 500))
        // 给执行一段时间
        delay(1000)

        // 关闭通道……
        chan.close()
        // 然后等待一段时间来让它结束
        delay(500)
    }
}