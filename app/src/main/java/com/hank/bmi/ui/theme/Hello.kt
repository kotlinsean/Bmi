package com.hank.bmi.ui.theme

import com.hank.bmi.Person

class Hello {
}

fun main(){
    val p = Person()
    p.hello()

    println("Hello Kotlin!")
    //Byte,Short,Int,Long(預設為Int)
    val age:Int=20
    val population=9999L
    println(age.inc())
    println(age)
    var name="Hank"
    println(name.get(1))
    name="Jack"
    println(name)
    //Float(32bits),Double(64bits)-(預設為Double)
    val weight:Float=65.5f
    //Boolen:true,false
    val isAdult=false
    //Char
    val c='A'
}