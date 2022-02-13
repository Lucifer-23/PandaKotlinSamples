package com.panda.kotlin.samples.code.chapter3

class Chapter3_6_3 {
    data class User(val name: String = "", val age: Int = 0)

    fun main() {
        val jane = User("Jane", 35)

        val (name, age) = jane

        // 输出"Jane, 35 years of age"
        println("$name, $age years of age")
    }
}