package com.panda.kotlin.samples.code.chapter5

class Chapter5_6_2_ONE {

    fun main() {
        // sampleStart
        val numbers = listOf("one", "two", "three", "four")
        // 'numbers'没有任何改变，结果丢失
        numbers.filter { it.length > 3 }
        println("numbers are still $numbers")
        // 结果存储在'longerThan3'中
        val longerThan3 = numbers.filter { it.length > 3 }
        println("numbers longer than 3 chars are $longerThan3")
        // sampleEnd
    }
}