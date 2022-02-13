package com.panda.kotlin.samples.code.chapter5

class Chapter5_13_THREE {

    fun main() {
        // sampleStart
        println(
            listOf("aaa", "bb", "c")
                .sortedWith(compareBy { it.length })
        )
        // sampleEnd
    }
}