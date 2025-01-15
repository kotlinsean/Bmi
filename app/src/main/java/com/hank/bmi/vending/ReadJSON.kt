package com.hank.bmi.vending

import java.net.URL

fun main() {
    //https://api.jsonserve.com/AXh1oX
    val input = URL("https://api.jsonserve.com/AXh1oX").openStream()
    val reader = input.bufferedReader()
    var line = reader.readLine()
    while(line != null) {
        println(line)
        line = reader.readLine()

    }
}


