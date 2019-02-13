package com.quick

data class Employee(val name:String, val age:Int, val weight:Float)

fun main() {
    val emp = Employee("Hank", 50, 70.5f)
    val name = emp.component1()
    val age = emp.component2()
    val w = emp.component3()
//    var (name, age, weight) = Employee("Jack", 30, 80.5f)        //原本使用上面四行才能賦值，可用左側一行處理完成

    println("$name $age")
}