package com.panda.kotlin.samples.code.chapter4

class Chapter4_3_3_V {
    inline fun <reified T> membersOf() = T::class.members

    fun main(s: Array<String>) {
        println(membersOf<StringBuilder>().joinToString("\n"))
    }
}