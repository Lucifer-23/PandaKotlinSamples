package com.panda.kotlin.samples.code.chapter3

class Chapter3_1_2_3_I {
    open class Base(val name: String) {
        init {
            println("Initializing Base")
        }

        open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
    }

    class Derived(
        name: String,
        val lastName: String
    ) : Base(name.capitalize().also { println("Arg for Base: $it") }) {
        init {
            println("Initializing Derived")
        }

        override val size: Int =
            (super.size + lastName.length).also {
                println(
                    "Initializing size in Derived: $it "
                )
            }
    }

    fun main() {
        println("Constructing Derived(\"hello\", \"world\")")
        val d = Derived("hello", "world")
    }
}