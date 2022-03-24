package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_15_3 {

    fun main() {
        val values = mapOf("first name" to "pearce", "last name" to "Wu")
        val email = values["email"]
            ?: throw IllegalStateException("Email is missing!")
    }
}