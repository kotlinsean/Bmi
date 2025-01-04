package com.hank.bmi

fun main(){
    val nums = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    nums.shuffle()
    val secret = nums.removeAt(0)
    val bomb = nums.removeAt(0)
    println(nums)
    println(secret)
    println(bomb)

    //List
    val list = mutableListOf<Int>(2, 5, 8)
    println(list)
    list.add(13)
    println(list)
    list.removeAt(1)
    println(list)
    //Array
    val array = intArrayOf(2,5,8)
    println(array)
    println(array.size)
    println(array[1])
    val ss = arrayOf("SUN","MON","TUE")
    println(ss.size)
    println(ss.get(0)) //跟第7行一樣意思
    for (day in ss) {
        println(day)
    }
    //For
    val range = 0..10
    for (i in 1..30){
        if (i % 2 == 1) {
            print("*")
        } else{
            print(" ")
        }
    }
    println()
    for (i in 1..10 step 2) print(i)
    println()
    var name:String?="Hank"
    println(name?.length) //name不是null才執行length，是null的話就回傳null
    print(name ?: 0)  //"?:"左邊若是null的話，得到右邊;不是的話就得到左邊(name)
    /*
    var counter=0
    counter=counter+1
    counter++
    counter=counter-1
    println(counter)
    //print(10%3)
    println(10/3.0)
    //Boolean
    var b=true
    var a=true
    //println(!b) //not
    println(a&&b) //and
    println(a||b) //or
    //
    val num=-8
    println(num<=5 && num>=-3)
    //
    println(num>5 || num<-3)*/
}