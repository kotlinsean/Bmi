package com.hank.bmi

import kotlin.random.Random

class GuessGame {
    enum class Status {
        INIT, BIGGER, SMALLER, BINGO
    }
    var secret:Int = Random.nextInt(1,11)
    var counter = 0
    var status = Status.INIT
    fun guess(n:Int) :Status {
        counter++
        return if (n > secret) Status.SMALLER
        else if (n < secret) Status.BIGGER
        else Status.BINGO
1    }
    fun reset() {
        secret = Random.nextInt(1,11)
        counter = 0
    }
}

fun main() {
    val game = GuessGame()
    val num = 3
    val result = game.guess(num)
}