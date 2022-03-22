package com.panda.kotlin.samples.code.chapter5

class Chapter5_2_5_I {

    fun main() {
        // sampleStart
        val sourceList = mutableListOf(1, 2, 3)
        val copyList = sourceList.toMutableList()
        val readOnlyCopyList = sourceList.toList()

        sourceList.add(4)

        println("Copy size: ${copyList.size}")

        // readOnlyCopyList.add(4) // 编译异常

        println("Read-only copy size: ${readOnlyCopyList.size}")
        // sampleEnd
    }
}