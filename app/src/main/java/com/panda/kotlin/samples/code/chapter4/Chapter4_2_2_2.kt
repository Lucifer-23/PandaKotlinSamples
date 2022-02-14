package com.panda.kotlin.samples.code.chapter4

class Chapter4_2_2_2 {
    fun main() {
        // sampleStart
        val stringPlus: (String, String) -> String = String::plus
        val intPlus: Int.(Int) -> Int = Int::plus
        println(stringPlus.invoke("<-", "->"))
        println(stringPlus("Hello, ", "world!"))
        println(intPlus.invoke(1, 1))
        println(intPlus(1, 2))
        println(2.intPlus(3)) // 类扩展调用
        // sampleEnd
    }
}