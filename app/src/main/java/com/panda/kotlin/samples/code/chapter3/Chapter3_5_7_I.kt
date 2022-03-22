package com.panda.kotlin.samples.code.chapter3

class Chapter3_5_7_I {
    class Host(val hostname: String) {
        fun printHostname() {
            print(hostname)
        }
    }

    class Connection(val host: Host, val port: Int) {
        fun printPort() {
            print(port)
        }

        fun Host.printConnectionString() {
            printHostname() // 调用Host.printHostname()
            print(":")
            printPort() // 调用Connection.printPort()
        }

        fun connect() {
            /*……*/
            host.printConnectionString() // 调用扩展函数
        }
    }

    fun main() {
        Connection(Host("kotlin"), 443).connect()
        // 错误，该扩展函数在Connection外不可用
        // Host("kotl.in").printConnectionString(443)
    }
}