package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

class Chapter6_6_4 {

    fun main() = runBlocking {
        // 从1开始生成整数
        val numbers = produceNumbers()

        // 整数求平方
        val squares = square(numbers)
        repeat(5) {
            // 输出前五个
            println(squares.receive())
        }

        // 至此已完成
        println("Done!")

        // 取消子协程
        coroutineContext.cancelChildren()
    }

    fun CoroutineScope.produceNumbers() = produce<Int> {
        var x = 1

        // 开启一个从1开始的无限的整数流
        while (true) send(x++)
    }

    fun CoroutineScope.square(numbers: ReceiveChannel<Int>)
            : ReceiveChannel<Int> = produce {
        for (x in numbers) send(x * x)
    }
}