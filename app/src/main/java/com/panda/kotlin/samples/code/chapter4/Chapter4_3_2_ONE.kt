package com.panda.kotlin.samples.code.chapter4

class Chapter4_3_2_ONE {
    fun ordinaryFunction(block: () -> Unit) {
        println("hi!")
    }

    // sampleStart
    fun foo() {
        ordinaryFunction {
            // return // 错误：不能使'foo'在此处返回
        }
    }
    // sampleEnd

    fun main() {
        foo()
    }
}