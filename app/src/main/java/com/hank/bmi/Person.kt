package com.hank.bmi

class Person(val name:String,val weight:Float,val height:Float) {
    //var weight:Float=0f //屬性property
    //var height:Float=0f
    fun bmi():Float{
        val bmi=weight/(height*height)
        return bmi
    }
    fun hello() {
        println("Hello")
    }
}