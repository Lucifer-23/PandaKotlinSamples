package com.panda.kotlin.samples.code.chapter5

class Chapter5_11_3_ONE {

    fun main() {
        // sampleStart
        val numbers = (0..13).toList()

        println(numbers.chunked(3))
        // sampleEnd
    }
}