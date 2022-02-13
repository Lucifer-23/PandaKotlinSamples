package com.panda.kotlin.samples.code.chapter5

class Chapter5_11_3_TWO {

    fun main() {
        // sampleStart
        val numbers = (0..13).toList()

        // 'it'为原始集合的一个块
        println(numbers.chunked(3) { it.sum() })
        // sampleEnd
    }
}