package com.quick.kotlin

import com.quick.Human
import com.quick.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiBmiTest() {
        val human = Human("Quick", 66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), human.bmi())
    }
    @Test
    fun personBmiTest() {
        val person = Person(66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())
    }
}