package com.panda.kotlin.samples.code.chapter3

import kotlin.properties.Delegates

class Chapter3_15_1_2_II {
    class User {
        var name: String by Delegates.vetoable("vetoable")
        { prop, old, new ->
            println("$old -> $new")
            true
        }
    }

    fun main() {
        val user = User()
        user.name = "first"
        user.name = "second"
    }
}