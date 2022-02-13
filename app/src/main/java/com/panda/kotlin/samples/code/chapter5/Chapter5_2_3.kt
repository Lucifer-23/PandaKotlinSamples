package com.panda.kotlin.samples.code.chapter5

class Chapter5_2_3 {

    fun main() {
        // sampleStart
        // 如果你想操作这个集合，应使用MutableList
        val doubled = List(3, { it * 2 })
        println(doubled)
        // sampleEnd
    }
}