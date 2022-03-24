package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_15_5 {

    fun main() {
        val value = listOf(null, "pearce@ms188.com")
        value?.let {
            // 代码会执行到此处，假如value不为null
        }
    }
}