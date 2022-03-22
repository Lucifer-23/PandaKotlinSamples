package com.panda.kotlin.samples.code.chapter5

class Chapter5_6_2_II {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        val filterResults = mutableListOf<String>() // 目标对象
        numbers.filterTo(filterResults) { it.length > 3 }
        numbers.filterIndexedTo(filterResults) { index, _ -> index == 0 }
        println(filterResults) // 包含两个操作的结果
        // sampleEnd
    }
}