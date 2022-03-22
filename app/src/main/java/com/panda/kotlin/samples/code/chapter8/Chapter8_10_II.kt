package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_II {

    data class Person(var name: String, var age: Int, var city: String) {
        fun moveTo(newCity: String) {
            city = newCity
        }

        fun incrementAge() {
            age++
        }
    }

    fun main() {
        val alice = Person("Alice", 20, "Amsterdam")
        println(alice)
        alice.moveTo("London")
        alice.incrementAge()
        println(alice)
    }
}