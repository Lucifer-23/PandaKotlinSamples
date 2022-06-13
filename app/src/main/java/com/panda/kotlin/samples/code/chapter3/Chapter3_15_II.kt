package com.panda.kotlin.samples.code.chapter3

import kotlin.reflect.KProperty

class Chapter3_15_II {
    class Delegate {
        operator fun getValue(
            thisRef: Any?,
            property: KProperty<*>
        ): String {
            return "$thisRef, thank you for delegating '${property.name} to me!'"
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            println("$value has been assigned to '${property.name}' in $thisRef")
        }
    }
}