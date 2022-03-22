package com.panda.kotlin.samples.code.chapter5

class Chapter5_2_5_II {

    fun main() {
        // sampleStart
        val sourceList = mutableListOf(1, 2, 3)
        val copySet = sourceList.toMutableSet()
        copySet.add(3)
        copySet.add(4)
        println(copySet)
        // sampleEnd
    }
}