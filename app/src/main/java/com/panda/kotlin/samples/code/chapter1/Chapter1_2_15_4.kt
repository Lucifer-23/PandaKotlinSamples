package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_15_4 {

    fun main() {
        val emails = listOf(null, "pearce@ms188.com")
        val mainMail = emails.firstOrNull() ?: ""
    }
}