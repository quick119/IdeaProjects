package com.quick

fun main() {
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

