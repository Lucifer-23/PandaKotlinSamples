package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_1_1_1 {

    data class Person(
        var name: String,
        var age: Int = 0,
        var city: String = ""
    )

    fun main() {
        val adam = Person("Adam").apply {
            // 和this.age = 20或者adam.age = 20一样
            age = 20
            city = "London"
        }
        println(adam)
    }
}