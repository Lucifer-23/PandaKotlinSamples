package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_12 {

    fun main() {
        val p: String by lazy {
            // 计算该字符串
            "fake"
        }
    }
}