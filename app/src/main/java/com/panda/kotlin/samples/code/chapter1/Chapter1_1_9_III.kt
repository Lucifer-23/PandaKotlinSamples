package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_9_III {

    // sampleStart
    fun getStringLength(obj: Any): Int? {
        // 'obj'在'&&'右边自动转换成'String'类型
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }

    // sampleEnd
    fun main() {
        fun printLength(obj: Any) {
            println(
                "'$obj' string length is ${getStringLength(obj)
                    ?: "... err, is empty or not a string at all"} "
            )
        }
        printLength("Incomprehensibilities")
        printLength("")
        printLength(listOf(Any()))
    }
}