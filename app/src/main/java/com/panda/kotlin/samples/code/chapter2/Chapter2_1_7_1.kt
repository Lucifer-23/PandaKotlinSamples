package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_7_1 {

    fun main() {
        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]

        // 大小为5，值为[0, 0, 0, 0, 0]的整型数组
        val arr = IntArray(5)

        // 例如：用常量初始化数组中的值
        // 大小为5，值为[42, 42, 42, 42, 42]的整型数组
        var arrConstant = IntArray(5){ 42 }

        // 例如：使用lambda表达式初始化数组中的值
        // 大小为5，值为[0, 1, 2, 3, 4]的整型数组(值初始化为其索引值)
        var arrLambda = IntArray(5){ it * 1 }
    }
}