package com.panda.kotlin.samples.code.chapter4

class Chapter4_2_2_1_THREE {
    fun main() {
        // sampleStart
        val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }

        val twoParameters: (String, Int) -> String = repeatFun // OK

        fun runTransformation(f: (String, Int) -> String): String {
            return f("hello", 3)
        }

        val result = runTransformation(repeatFun) // OK
        // sampleEnd

        println("result = $result")
    }
}