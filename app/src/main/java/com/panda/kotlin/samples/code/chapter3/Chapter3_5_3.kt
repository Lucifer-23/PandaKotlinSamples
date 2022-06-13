package com.panda.kotlin.samples.code.chapter3

class Chapter3_5_3 {
    fun Any?.toString(): String {
        if (this == null) return "null"

        // 空检测之后，"this"会自动转换为非空类型，
        // 所以下面的toString()解析为Any类的成员函数
        return toString()
    }
}