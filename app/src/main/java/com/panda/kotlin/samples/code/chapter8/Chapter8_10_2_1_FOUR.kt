package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_1_FOUR {

    fun processNonNullString(str: String) {}

    fun main() {
        val str: String? = "Hello"
        // 编译错误：str可能为空
        // processNonNullString(str)
        val length = str?.let {
            println("let() called on $it")
            // 编译通过：'it'在'?.let { }'中必不为空
            processNonNullString(it)
            it.length
        }
    }
}