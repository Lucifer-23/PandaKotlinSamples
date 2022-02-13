package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_9_TWO {

    // sampleStart
    fun getStringLength(obj: Any): Int? {
        if (obj !is String) return null
        // 'obj'在这一分支自动转换为'String'
        return obj.length
    }

    // sampleEnd
    fun main() {
        fun printLength(obj: Any) {
            println(
                "'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} "
            )
        }
        printLength("Incomprehensibilities")
        printLength(1000)
        printLength(listOf(Any()))
    }
}