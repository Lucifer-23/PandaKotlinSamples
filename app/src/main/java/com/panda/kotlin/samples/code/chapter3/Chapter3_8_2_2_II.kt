package com.panda.kotlin.samples.code.chapter3

class Chapter3_8_2_2_II {

    class Star<out T>

    class Star2<in T> {
        fun setValue(t: T) {
        }
    }

    fun main() {
        val star: Star<Number> = Star<Int>()
        var star2: Star<*> = star

        var star3: Star2<Int> = Star2<Number>()
        var star4: Star2<*> = star3
        star4.setValue(3 as Nothing)
        // star4.setValue(3)
    }
}