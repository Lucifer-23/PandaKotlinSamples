package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Chapter6_6_9 {

    data class Ball(var hits: Int)

    fun main() = runBlocking {
        // 一个共享的 table(桌子)
        val table = Channel<Ball>()
        launch { player("ping", table) }
        launch { player("pong", table) }
        // 乒乓球
        table.send(Ball(0))
        // 延迟1秒钟
        delay(1000)
        // 游戏结束，取消它们
        coroutineContext.cancelChildren()
    }

    suspend fun player(name: String, table: Channel<Ball>) {
        // 在循环中接收球
        for (ball in table) {
            ball.hits++
            println("$name $ball")
            // 等待一段时间
            delay(300)
            // 将球发送回去
            table.send(ball)
        }
    }
}