package com.kotlin

import java.util.*

data class Ticket(val origin:Int, val destination:Int, val price:Int)   //data class：建立資料模型，無需再用建構子及Setter Getter

fun main() {
    var ticket = Ticket(20, 51, 420)
    val s = "abcde"
    println(s.validate())
    println((1..10).random())                    //IntRange的用法
    val r = Random().nextInt(10) + 1    //比起上一行，可讀性較低
}

fun String.validate() :Boolean {
    return this.length >= 6
}

fun IntRange.random() :Int{
    val r = Random().nextInt(endInclusive-start)+start
    return r
}