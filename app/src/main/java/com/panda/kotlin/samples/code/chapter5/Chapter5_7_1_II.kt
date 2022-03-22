package com.panda.kotlin.samples.code.chapter5

import kotlin.properties.Delegates

class Chapter5_7_1_II {

    fun main() {
        // sampleStart
        val numbers = setOf(1, 2, 3)
        println(numbers.mapNotNull { if (it == 2) null else it * 3 })
        println(numbers.mapIndexedNotNull { idx, value ->
            if (idx == 0) null else value *
                    idx
        })
        // sampleEnd
    }
}