package com.panda.kotlin.samples.code.chapter1

class Chapter1_1_6 {
    fun main() {
        var a = 1
        val s1 = "a is $a"
        a = 2
        // 模板中的任意表达式：
        val s2 = "${s1.replace("is", "was")}, but now is $a"
        println(s2)
    }
}