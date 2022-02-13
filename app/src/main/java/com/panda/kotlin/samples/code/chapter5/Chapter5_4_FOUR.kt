package com.panda.kotlin.samples.code.chapter5

class Chapter5_4_FOUR {

    fun main() {
        // sampleStart
        for (i in 1 until 10) { // i in [1, 10), 10被排除
            print(i)
        }
        println()
        // sampleEnd
    }
}