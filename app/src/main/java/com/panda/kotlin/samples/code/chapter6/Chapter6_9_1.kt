package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select

class Chapter6_9_1 {

    fun CoroutineScope.fizz() = produce<String> {
        // 每300毫秒发送一个"Fizz"
        while (true) {
            delay(300)
            send("Fizz")
        }
    }

    fun CoroutineScope.buzz() = produce<String> {
        // 每500毫秒发送一个"Buzz!"
        while (true) {
            delay(500)
            send("Buzz!")
        }
    }

    suspend fun selectFizzBuzz(
        fizz: ReceiveChannel<String>,
        buzz: ReceiveChannel<String>
    ) {
        select<Unit> {
            // <Unit>意味着该select表达式不返回任何结果
            fizz.onReceive { value ->
                // 这是第一个select子句
                println("fizz -> '$value'")
            }

            buzz.onReceive { value ->
                // 这是第二个select子句
                println("buzz -> '$value'")
            }
        }
    }

    fun main() = runBlocking<Unit> {
        val fizz = fizz()
        val buzz = buzz()
        repeat(7) {
            selectFizzBuzz(fizz, buzz)
        }

        // 取消fizz和buzz协程
        coroutineContext.cancelChildren()
    }
}