package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_4 {

    fun main() {
        val emailList = listOf("pearce@qqc88.net", "pearce@ms188.com", "john@example.com")

        if ("john@example.com" in emailList) {

        }

        if ("jane@example.com" !in emailList) {

        }
    }
}