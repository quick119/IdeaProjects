package com.quick

import com.kotlin.Student

fun main() {
    val stu = Student("Hank", 50, 60)
    stu.grading();
    var s:String? = "abcde"
    s = null
    println(s!!.length)
    println(s?.get(3))
    println(s?.substring(3))
}

class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test $weight")
    }
//    constructor(name:String, weight: Float, height: Float) :this(weight, height)
    fun bmi() :Float {
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("Hello kotlin")
    }
}

