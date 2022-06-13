package com.panda.kotlin.samples.code.chapter3

class Chapter3_6_2_II {
    data class User(val name: String = "", val age: Int = 0)

    fun main() {
        val jack = User("Jane", 1)

        val olderJack = jack.copy(age = 2)
    }
}