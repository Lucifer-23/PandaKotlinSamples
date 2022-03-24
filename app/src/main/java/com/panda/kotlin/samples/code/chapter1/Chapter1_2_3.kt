package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_3 {

    fun main() {
        val list = listOf(1, 2, 3 -1)

        val positives = list.filter { x -> x > 0 }
        // val positives = list.filter{ it > 0 }
        println(positives)
    }
}