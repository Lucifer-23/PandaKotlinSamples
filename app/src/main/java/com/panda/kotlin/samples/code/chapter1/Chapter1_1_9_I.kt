package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_9_I {

    // sampleStart
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 'obj'在该条件分支内自动转换成'String'
            return obj.length
        }
        // 在离开类型检测分支后，'obj'仍然是'Any'类型
        return null
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