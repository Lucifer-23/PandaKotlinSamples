package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_8_V {
    fun foo() {
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                // 从传入run 的lambda 表达式非局部返回
                if (it == 3) return@loop
                print(it)
            }
        }
        print(" done with nested loop")
        println()
    }

    fun main() {
        foo()
    }
}