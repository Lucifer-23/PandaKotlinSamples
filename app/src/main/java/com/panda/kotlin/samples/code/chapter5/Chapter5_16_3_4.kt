package com.panda.kotlin.samples.code.chapter5

import kotlin.math.sign

class Chapter5_16_3_4 {
    // sampleStart
    data class Product(val name: String, val price: Double)

    fun priceComparison(product: Product, price: Double) =
        sign(product.price - price).toInt()

    fun main() {
        val productList = listOf(
            Product("WebStorm", 49.0),
            Product("AppCode", 99.0),
            Product("DotTrace", 129.0),
            Product("ReSharper", 149.0)
        )
        println(productList.binarySearch { priceComparison(it, 99.0) })
    }
// sampleEnd
}