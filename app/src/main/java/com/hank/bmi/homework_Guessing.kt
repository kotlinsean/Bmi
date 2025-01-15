package com.hank.bmi

fun main() {
    val secret = (1..10).random()
    println(secret)
    var front=1
    var back=10
    var num = 0
    while (num != secret) {
        print("Please enter a number($front-$back):")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0 //如果是null就得到右邊，不是的話就得到左邊
        if (num > secret) {
            back = num
        } else if (num < secret) {
            front = num
        }
    }
    println("You got it!")
}
