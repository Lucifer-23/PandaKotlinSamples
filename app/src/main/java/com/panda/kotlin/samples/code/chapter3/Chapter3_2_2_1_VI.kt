package com.panda.kotlin.samples.code.chapter3

class Chapter3_2_2_1_VI {
    var size = 0

    // isEmpty没有幕后字段
    /*
    dfa
     * */
    var isEmpty = false
        get() = size == 0
        set(value) {
            size *= 2
            field = value
        }
}