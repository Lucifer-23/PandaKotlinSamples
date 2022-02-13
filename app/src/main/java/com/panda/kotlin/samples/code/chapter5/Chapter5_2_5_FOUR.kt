package com.panda.kotlin.samples.code.chapter5

class Chapter5_2_5_FOUR {

    fun main() {
        // sampleStart
        val sourceList = mutableListOf(1, 2, 3)
        val referenceList: List<Int> = sourceList
        // referenceList.add(4) // 编译错误
        sourceList.add(4)
        println(referenceList) // 显示sourceList当前状态
        // sampleEnd
    }
}