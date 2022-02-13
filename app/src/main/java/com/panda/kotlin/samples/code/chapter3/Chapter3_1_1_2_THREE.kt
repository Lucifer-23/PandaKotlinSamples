package com.panda.kotlin.samples.code.chapter3

class Chapter3_1_1_2_THREE {
    class Constructors {
        init {
            println("Init block")
        }

        constructor(i: Int) {
            println("Constructor")
        }
    }

    fun main() {
        Constructors(1)
    }
}