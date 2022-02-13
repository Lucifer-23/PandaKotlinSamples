package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_8_ONE {
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) {
                println()
                return // 非局部直接返回到foo()的调用者
            }
            print(it)
        }
        println("this point is unreachable")
    }

    fun main() {
        foo()
    }
}