package com.panda.kotlin.samples.code.chapter8

class Chapter8_8_1_TWO {

    @Target(
        AnnotationTarget.CLASS,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.EXPRESSION
    )

    @Retention(AnnotationRetention.SOURCE)

    @MustBeDocumented
    annotation class Fancy
}