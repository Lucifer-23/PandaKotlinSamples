package com.panda.kotlin.samples.code.chapter1

class Chapter1_2_15_6 {

    fun transformValue(email: String?): String? {

        return email ?: null
    }

    fun main() {
        val value = "pearce@ms188.com"

        val defaultValue = "pearce@qqc88.net"

        val mapped = value?.let {
            transformValue(it)
        } ?: defaultValue
        // 如果该值或其转换结果为空，那么返回defaultValue
    }
}