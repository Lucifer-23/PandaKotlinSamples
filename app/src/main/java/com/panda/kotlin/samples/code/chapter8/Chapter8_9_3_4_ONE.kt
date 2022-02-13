package com.panda.kotlin.samples.code.chapter8

import kotlin.reflect.jvm.*

class Chapter8_9_3_4_ONE {

    class A(val p: Int)

    fun main() {
        // 输出"public final int A.getP()"
        println(A::p.javaGetter)

        // 输出"private final int A.p"
        println(A::p.javaField)
    }
}