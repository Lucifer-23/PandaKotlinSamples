package com.panda.kotlin.samples.code.chapter1

import java.nio.file.Files
import java.nio.file.Paths

class Chapter1_2_23 {

    fun main() {
        val stream = Files.newInputStream(Paths.get("/some/file.txt"))
        stream.buffered().reader().use { reader ->
            println(reader.readText())
        }
    }
}