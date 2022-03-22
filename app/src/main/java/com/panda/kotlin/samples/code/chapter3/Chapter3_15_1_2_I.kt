package com.panda.kotlin.samples.code.chapter3

import kotlin.properties.Delegates

class Chapter3_15_1_2_I {
    class User {
        var name: String by Delegates.observable("<no name>")
        { prop, old, new ->
            println("$old -> $new")
        }
    }

    fun main() {
        val user = User()
        user.name = "first"
        user.name = "second"
    }
}