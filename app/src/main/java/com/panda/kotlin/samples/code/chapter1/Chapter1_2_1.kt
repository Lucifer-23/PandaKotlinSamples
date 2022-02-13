package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_1 {
    data class Customer(val name: String, val email: String)

    fun main() {
        val customer = Customer("Panda", "qqc.pearce@gmail.com")
        println("The Customer is ${customer.toString()}")
        println("The email of Customer ${customer.name} is ${customer.email}")
    }
}