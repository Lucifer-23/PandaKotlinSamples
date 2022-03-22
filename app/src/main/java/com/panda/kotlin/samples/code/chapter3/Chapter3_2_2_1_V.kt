package com.panda.kotlin.samples.code.chapter3

class Chapter3_2_2_1_V {
    class Person(var gender: Gender) {
        var name: String = ""
            set(value) {
                field = when (gender) {
                    Gender.MALE -> "Jake.$value"
                    Gender.FEMALE -> "Rose.$value"
                }
            }
    }

    enum class Gender {
        MALE,
        FEMALE
    }

    fun main(args: Array<String>) {
        // 性别MALE
        var person = Person(Gender.MALE)
        person.name = "Love"
        println("打印结果:${person.name}")
        // 性别：FEMALE
        var person2 = Person(Gender.FEMALE)
        person2.name = "Love"
        println("打印结果:${person2.name}")
    }
}