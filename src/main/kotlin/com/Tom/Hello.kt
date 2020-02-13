package com.Tom

fun main(args: Array<String>) {
//    Human().hello()
    val h = Human(1.5f,88f)
    println(h.bmi())
    h.hello()
}
//主要建構子 給初始值擺最後可省略
class Human(var height: Float, var weight: Float, var name : String = ""){

    init {
        println("init $weight")
    }

    //次要建構子constuctor 有報錯
//    constructor(tex: String, num: Int) : this(tex,num)

    fun bmi():Float{
        val bmi = height/(weight*weight)
        return  bmi
    }
    fun hello(){
        println("Hello kotlin")
    }
}