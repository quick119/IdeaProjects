package com.quick

fun main() {
    var s:String? = "abcde"
    s = null
    println(s!!.length)
    println(s?.get(3))
    println(s?.substring(3))
}

