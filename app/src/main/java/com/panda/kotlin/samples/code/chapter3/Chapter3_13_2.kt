package com.panda.kotlin.samples.code.chapter3

interface Printable {
    fun prettyPrint(): String
}

inline class Name2(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}


class Chapter3_13_2 {

    fun main() {
        val name = Name2("Kotlin")
        println(name.prettyPrint()) // 仍然会作为一个静态方法被调用
    }
}