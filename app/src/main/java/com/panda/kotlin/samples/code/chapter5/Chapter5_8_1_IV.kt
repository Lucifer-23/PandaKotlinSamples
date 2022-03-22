package com.panda.kotlin.samples.code.chapter5

class Chapter5_8_1_IV {

    fun main() {
        // sampleStart
        val numbers = listOf(null, "one", "two", null)

        numbers.filterNotNull().forEach {
            // 对可空的String来说长度不可用
            println(it.length)
        }
        // sampleEnd
    }
}