package com.panda.kotlin.samples.code.chapter2

class Chapter2_1_3_9 {

    fun main() {

        var one = 0b101101

        printInt(" 1. Before", one)

        printInt(" 1.  After", (one shr 1))

        var two = 0b101101

        printInt(" 2. Before", two)

        printInt(" 2.  After", (two shl 1))

        var three = 0b101101

        printInt(" 3. Before", three)

        printInt(" 3.  After", (three shl 1) + 1)

        var four = 0b101100

        printInt(" 4. Before", four)

        printInt(" 4.  After", (four or 1))

        var five = 0b101101

        printInt(" 5. Before", five)

        printInt(" 5.  After", (five or 1) - 1)

        var six = 0b101101

        printInt(" 6. Before", six)

        printInt(" 6.  After", (six xor 1))

        var seven = 0b101001

        printInt(" 7. Before", seven)

        printInt(" 7.  After", (seven or (1 shl 2)))

        var eight = 0b101101

        printInt(" 8. Before", eight)

        printInt(" 8.  After", (eight xor (1 shl 2)))
        printInt(" 8.  After", (eight and (1 shl 2).inv()))

        var nine = 0b101001

        printInt(" 9. Before", nine)

        printInt(" 9.  After", (nine xor (1 shl 2)))

        var ten = 0b1101101

        printInt("10. Before", ten)

        printInt("10.  After", (ten and 7))

        var eleven = 0b1101101

        printInt("11. Before", eleven)

        printInt("11.  After", (eleven and ((-1 shl 4).inv())))

        var twelve = 0b1101101

        printInt("12. Before", twelve)

        printInt("12.  After", (twelve shr 3 and 1))

        var thirteen = 0b101001

        printInt("13. Before", thirteen)

        printInt("13.  After", (thirteen or (-1 shl 4).inv()))

        var fourteen = 0b101001

        printInt("14. Before", fourteen)

        printInt("14.  After", (fourteen xor (-1 shl 4).inv()))

        var fifteen = 0b100101111

        printInt("15. Before", fifteen)

        printInt("15.  After", (fifteen and (fifteen + 1)))

        var sixteen = 0b100101111

        printInt("16. Before", sixteen)

        printInt("16.  After", (fifteen or (fifteen + 1)))

        var seventeen = 0b11011000

        printInt("17. Before", seventeen)

        printInt("17.  After", (seventeen or (seventeen - 1)))

        var eighteen = 0b100101111

        printInt("18. Before", eighteen)

        printInt("18.  After", ((eighteen xor (eighteen + 1)) shr 1))

        var nineteen = 0b100101000

        printInt("19. Before", nineteen)

        printInt("19.  After", (nineteen and  (nineteen xor (nineteen - 1))))
        printInt("19.  After", (nineteen and  -nineteen))
    }

    private fun printInt(description: String, integer: Int) {
        print("$description binary is ${Integer.toBinaryString(integer)}")
        println(", Decimal is $integer")
    }
}