package com.panda.kotlin.samples.code.chapter6

import kotlinx.coroutines.channels.ticker
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

class Chapter6_6_10 {

    fun main() = runBlocking<Unit> {
        // 创建计时器通道
        val tickerChannel = ticker(delayMillis = 100, initialDelayMillis = 0)
        var nextElement = withTimeoutOrNull(1) { tickerChannel.receive() }
        // 初始尚未经过的延迟
        println("Initial element is available immediately: $nextElement")

        // 所有随后到来的元素都经过了100毫秒的延迟
        nextElement = withTimeoutOrNull(50) { tickerChannel.receive() }
        println("Next element is not ready in 50 ms: $nextElement")

        nextElement = withTimeoutOrNull(60) { tickerChannel.receive() }
        println("Next element is ready in 100 ms: $nextElement")

        // 模拟大量消费延迟
        println("Consumer pauses for 150ms")
        delay(150)

        // 下一个元素立即可用
        nextElement = withTimeoutOrNull(1) { tickerChannel.receive() }
        println(
            "Next element is available immediately after " +
                    "large consumer delay: $nextElement"
        )

        // 请注意，'receive'调用之间的暂停被考虑在内，下一个元素的到达速度更快
        nextElement = withTimeoutOrNull(60) { tickerChannel.receive() }
        println(
            "Next element is ready in 50ms after " +
                    "consumer pause in 150ms: $nextElement"
        )

        // 表明不再需要更多的元素
        tickerChannel.cancel()
    }
}