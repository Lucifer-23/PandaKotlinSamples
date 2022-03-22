package com.panda.kotlin.samples.code.chapter5

class Chapter5_6_2_III {

    fun main() {
        val numbers = listOf("one", "two", "three", "four")
        // sampleStart
        // 将数字直接过滤到新的哈希集中，
        // 从而消除结果中的重复项
        val result = numbers.mapTo(HashSet()) { it.length }
        println("distinct item lengths are $result")
        // sampleEnd
    }
}