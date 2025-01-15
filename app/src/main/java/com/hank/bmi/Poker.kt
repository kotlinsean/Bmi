package com.hank.bmi

fun main() {
    val set = setOf<Int>(5,3,9,3,2,1,9)
    println(set)
    set.forEach { println(it) }
    // C,D,H,S
    val list = listOf<Int>(5,3,8,5,3,2,1)
    println(list)
    val deck = mutableListOf<Int>()
    for (i in 0 until 52) {
        deck.add(i)
        if (i % 13 == 0 && i != 0) println()
        val a = i / 13
        var type = when(a) {
            0 -> "♣"
            1 -> "♢"
            2 -> "♡"
            else -> "♠"
        }
        print("${(i%13)+1}$type ")
        /*
        var type = "S"
        if (a == 0){
            type = "C"
        } else if (a == 1) {
            type = "D"
        } else if (a == 2) {,
            type = "H"
        }
        print("${(i%13)+1}$type ") */
        /*
        var type = if (a == 0) {
                "C"
            } else if (a == 1) {
                "D"
            } else if (a == 2) {
                "H"
            } else "S"*/
    }
    println()
    println(deck)
    val deck2 = deck.shuffled()
    println(deck)
    println(deck2)
}