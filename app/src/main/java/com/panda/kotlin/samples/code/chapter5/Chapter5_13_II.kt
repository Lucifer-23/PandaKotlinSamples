package com.panda.kotlin.samples.code.chapter5

class Chapter5_13_II {

    fun main() {
        // sampleStart
        val lengthComparator = Comparator { str1: String,
                                            str2: String ->
            str1.length - str2.length
        }

        println(listOf("aaa", "bb", "c").sortedWith(lengthComparator))
        // sampleEnd
    }
}