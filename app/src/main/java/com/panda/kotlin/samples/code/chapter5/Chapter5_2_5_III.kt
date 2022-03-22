package com.panda.kotlin.samples.code.chapter5

class Chapter5_2_5_III {

    fun main() {
        // sampleStart
        val sourceList = mutableListOf(1, 2, 3)
        val referenceList = sourceList
        referenceList.add(4)
        println("Source size: ${sourceList.size}")
        // sampleEnd
    }
}