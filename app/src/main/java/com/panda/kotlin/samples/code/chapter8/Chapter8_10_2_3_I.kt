package com.panda.kotlin.samples.code.chapter8

class Chapter8_10_2_3_I {

    class MultiportService(var url: String, var port: Int) {
        fun prepareRequest(): String = "Default request"
        fun query(request: String): String = "Result for query '$request'"
    }

    fun main() {
        val service = MultiportService("https://example.kotlinlang.org", 80)

        val result = service.run {
            port = 8080
            query(prepareRequest() + " to port $port")
        }

        // 同样的代码如果用let()函数来写:
        val letResult = service.let {
            it.port = 8080
            it.query(it.prepareRequest() + " to port ${it.port}")
        }
        println(result)
        println(letResult)
    }
}