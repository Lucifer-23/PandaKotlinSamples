package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_4_II {

    data class StringContainer                      (val values: List<String>)

    fun main() {
        // sampleStart
        val containers = listOf(
            StringContainer(listOf("one", "two", "three")),
            StringContainer(listOf("four", "five", "six")),
            StringContainer(listOf("seven", "eight"))
        )

        println(containers)
        // sampleEnd
    }
}