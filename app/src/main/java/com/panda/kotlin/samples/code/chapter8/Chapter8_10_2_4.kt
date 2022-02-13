package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_4 {

    data class Person(
        var name: String,
        var age: Int = 0,
        var city: String = ""
    )

    fun main() {
        val adam = Person("Adam").apply {
            age = 32
            city = "London"
        }
        println(adam)
    }
}