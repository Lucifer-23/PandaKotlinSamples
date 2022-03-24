package com.panda.kotlin.samples.code.chapter1

import java.io.File

class Chapter1_2_15_1 {

    fun main() {
        val files = File("Test").listFiles()
        println(files?.size)
    }
}