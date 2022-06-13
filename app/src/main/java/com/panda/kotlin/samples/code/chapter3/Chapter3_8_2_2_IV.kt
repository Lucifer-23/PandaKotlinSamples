package com.panda.kotlin.samples.code.chapter3

class Chapter3_8_2_2_IV {

    class Star<out T>

    class Star2<in T> {
        fun setValue(t: T) {
        }
    }

    class Star3<T>(private var t: T) {
        fun setValue(t: T) {
            this.t = t
        }

        fun getValue(): T {
            return this.t
        }
    }

    fun main() {
        val star: Star<Number> = Star<Int>()
        var star2: Star<*> = star

        var star3: Star2<Int> = Star2<Number>()
        var star4: Star2<*> = star3
        star4.setValue(3 as Nothing)
        // star4.setValue(3)

        val star5: Star3<String> = Star3<String>("hello")
        val star6: Star3<*> = star5

        println(star6.getValue())
        // star6.setValue("test") // 编译错误
    }
}