package com.panda.kotlin.samples.code.chapter2

class Chapter2_3_1_ONE {

    fun main() {

        // 传统用法
        val a = 3
        val b = 4
        var max = a
        if (a < b) {
            max = b
        }

        // With else
        var maxWithElse: Int
        if (a > b) {
            max = a
        } else {
            max = b
        }

        // 作为表达式
        val maxExpression = if (a > b) a else b
    }
}