package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_8_II {
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            // 局部返回到该lambda 表达式的调用者，即forEach 循环
            if (it == 3) return@lit
            print(it)
        }
        print(" done with explicit label")
        println()
    }

    fun main() {
        foo()
    }
}