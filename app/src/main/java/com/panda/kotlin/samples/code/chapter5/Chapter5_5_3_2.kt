package com.panda.kotlin.samples.code.chapter5

class Chapter5_5_3_2 {

    fun main() {
        // sampleStart
        val words = "The quick brown fox jumps over the lazy dog".split(" ")
        // 将列表转换为序列
        val wordsSequence = words.asSequence()
        val lengthsSequence = wordsSequence.filter {
            println("filter: $it"); it.length > 3
        }.map { println("length: ${it.length}"); it.length }
            .take(4)
        println("Lengths of first 4 words longer than 3 chars")
        // 末端操作：以列表形式获取结果。
        println(lengthsSequence.toList())
        // sampleEnd
    }
}