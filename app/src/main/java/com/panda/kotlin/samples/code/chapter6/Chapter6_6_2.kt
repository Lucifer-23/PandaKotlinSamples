package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_6_2 {

    fun main() = runBlocking {
        val channel = Channel<Int>()
        launch {
            for (x in 1..5) channel.send(x * x)
            // 我们结束发送
            channel.close()
        }

        // 这里我们使用'for'循环
        // 来打印所有被接收到的元素(直到通道被关闭)
        for (y in channel) println(y)
        println("Done!")
    }
}