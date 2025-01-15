package com.hank.bmi.student

//學生有學號、姓名、英文、數學成績
//印出學生資料
//印出學生平均成績
//印出學生等級(A,B,C,D,F)
open class Student(val id:String, val name:String,
                var english:Int = 0, var math:Int = 0) {
    companion object {
        var pass = 60
    }
//    constructor(id:String, name:String) : this(id, name, 0, 0)
    open fun print() {
        val mark = if (average() < pass) "*" else " "
        println("$id\t$name\t$english\t$math\t${average()}$mark\t${grading()}")
    }

    //預設為public, protected表可在子類別中使用,internal表在模組中可使用
    protected fun average() = (english + math) / 2


    fun grading() = when (average() / 10) {
            9, 10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"

    }
}

fun main() {
    Student.pass = 50
    val students = listOf<Student>(
    Student("001", "Jack", 60, 40) ,
    Student("002", "Hank", 66, 87),
    Student("003", "Jane")
    )
    for (stu in students) {
        stu.print()
    }


    /*
    for (i in 0..2) {
        students.get(i).print()
    }



    //
    val stu1 = Student("001", "Jack", 70, 80)
    val stu2 = Student("002", "Hank", 66, 87)
    val stu3 = Student("003", "Jane")
    stu1.print()
    stu2.print()
    stu3.print()*/
}
