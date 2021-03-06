package com.panda.kotlin.samples.code.chapter5

class Chapter5_7_2_I {

    fun main() {
        // sampleStart
        val colors = listOf("red", "brown", "grey")
        val animals = listOf("fox", "bear", "wolf")

        println(colors zip animals)

        val twoAnimals = listOf("fox", "bear")

        println(colors.zip(twoAnimals))
        // sampleEnd
    }
}