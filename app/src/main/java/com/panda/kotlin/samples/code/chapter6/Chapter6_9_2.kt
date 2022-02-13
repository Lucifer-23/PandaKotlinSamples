package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select

class Chapter6_9_2 {

    suspend fun selectAorB(
        a: ReceiveChannel<String>,
        b: ReceiveChannel<String>
    ): String =
        select<String> {
            a.onReceiveOrNull { value ->
                if (value == null)
                    "Channel 'a' is closed"
                else
                    "a -> '$value'"
            }

            b.onReceiveOrNull { value ->
                if (value == null)
                    "Channel 'b' is closed"
                else
                    "b -> '$value'"
            }
        }

    fun main() = runBlocking<Unit> {
        val a = produce<String> {
            repeat(4) { send("Hello $it") }
        }

        val b = produce<String> {
            repeat(4) { send("World $it") }
        }

        // 打印最早的八个结果
        repeat(8) {
            println(selectAorB(a, b))
        }

        coroutineContext.cancelChildren()
    }
}