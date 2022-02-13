package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

class Chapter6_6_5 {

    fun main() = runBlocking {
        var cur = numbersFrom(2)
        repeat(10) {
            val prime = cur.receive()
            println(prime)
            cur = filter(cur, prime)
        }

        // 取消所有的子协程来让主协程结束
        coroutineContext.cancelChildren()
    }

    fun CoroutineScope.numbersFrom(start: Int) = produce<Int> {
        var x = start

        // 开启一个从start开始的无限的整数流
        while (true) send(x++)
    }

    fun CoroutineScope.filter(
        numbers: ReceiveChannel<Int>,
        prime: Int
    ) = produce<Int> {
        for (x in numbers)
            if (x % prime != 0)
                send(x)
    }
}