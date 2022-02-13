package com.panda.kotlin.samples.code.chapter6

class Chapter6_5_1_1 {
    fun foo(): Sequence<Int> = sequence {
        // 序列构建器
        for (i in 1..3) {
            // 假装我们正在计算
            Thread.sleep(1000)

            // 产生下一个值
            yield(i)
        }
    }

    fun main() {
        foo().forEach { value -> println(value) }
    }
}