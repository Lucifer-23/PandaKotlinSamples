package com.panda.kotlin.samples.code.chapter3

@JvmInline
value class Name(val s: String) {
    init {
        require(s.length > 0)
    }

    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}

class Chapter3_13_1 {

    fun main() {
        val name = Name("Kotlin")
        name.greet() // 'greet'方法会作为一个静态方法被调用
        println(name.length) // 属性的get方法会作为一个静态方法被调用
    }
}