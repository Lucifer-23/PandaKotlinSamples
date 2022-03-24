package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_8 {

    fun main() {
        val x = 5

        for (i in 1..100) {} // 闭区间：包含100
        for (i in 1 until 100) {} // 半开区间：不包含100
        for (x in 2..10 step 2) {}
        for (x in 10 downTo 1) {}
        if (x in 1..10) {}
    }
}