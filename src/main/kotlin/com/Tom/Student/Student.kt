package com.Tom.Student

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val s1 = student("Hank", 99, 88)
    s1.print()
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("請輸入姓名：")
    val name = scanner.next()
    print("請輸入英文成績：")
    val english = scanner.nextInt()
    print("請輸入數學成績：")
    val math = scanner.nextInt()
    val s1 = student(name, english, math)
    s1.print()
}

class student(val name : String, val english : Int, val math : Int){

    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${grading()}\t${passOrFailed()}" )
    }

    fun getAverage() = (math + english) / 2

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun passOrFailed() = if(getAverage()>=60) "Pass" else "Failed"

}