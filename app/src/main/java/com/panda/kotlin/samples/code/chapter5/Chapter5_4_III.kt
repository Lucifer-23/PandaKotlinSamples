package com.panda.kotlin.samples.code.chapter5

class Chapter5_4_III {

    fun main() {
        // sampleStart
        for (i in 1..8 step 2) print(i)
        println()
        for (i in 8 downTo 1 step 2) print(i)
        println()
        // sampleEnd
    }
}