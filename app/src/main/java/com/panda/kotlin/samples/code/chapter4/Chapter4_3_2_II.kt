package com.panda.kotlin.samples.code.chapter4

class Chapter4_3_2_II {
    inline fun inlined(block: () -> Unit) {
        println("hi!")
    }

    // sampleStart
    fun foo() {
        inlined {
            return // OK：该lambda表达式是内联的
        }
    }
    // sampleEnd

    fun main() {
        foo()
    }
}