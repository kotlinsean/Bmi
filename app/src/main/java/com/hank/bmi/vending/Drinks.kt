package com.hank.bmi.vending

fun Drink.off20() : Drink {
    return this.copy(price = (this.price * 0.8).toInt())
}

fun main() {
    val s = "abcdef"
    println(s.validate())
    val tea = Drink("Blacktea", 0 ,50)
    val discountTea = tea.off20()
    println(tea)
    println(discountTea)
    val tea2 = tea.copy(suger = 5)
    println(tea2)
    val drinks = mutableMapOf<Int, String>(
        //前面是Key,後面是Value,key可以不能重複;但value可以
        1 to "Coke",
        2 to "7-up",
        3 to "Wuloong",
        4 to "Orange"
    )
    println(drinks.get(3))
    println(drinks)
    drinks.put(5, "Water")
    println(drinks)
}

fun String.validate() : Boolean {//擴充功能Extensions
    return this.length >= 6 //在字串方法中拿到本身，用this
}