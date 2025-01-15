package com.hank.bmi.vending

import androidx.collection.mutableIntListOf
import java.io.File

fun main() {
    val drinks = mutableListOf<Drink>()
    val input = File("order.txt").bufferedReader()
    var line = input.readLine()
    while (line != null) {
        println(line)//Black tea,0,50
        val tokens = line.split(",")
        try {
            val drink = Drink(tokens[0],tokens[1].toInt(),
                tokens[2].toInt())
            drinks.add(drink)
        }
        catch (ex:IndexOutOfBoundsException) {
            println("Invalid line data format!")
        }
        line = input.readLine()
    }
    println(drinks)
}