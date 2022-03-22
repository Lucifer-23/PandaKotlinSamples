package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_8_IV {
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
            // 局部返回到匿名函数的调用者，即forEach 循环
            if (value == 3) return
            print(value)
        })
        print(" done with anonymous function")
        println()
    }

    fun main() {
        foo()
    }
}