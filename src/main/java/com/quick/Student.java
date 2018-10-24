package com.quick;

public class Student {
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int Highest() {
        return (math > english) ? math : english;
    }

    public void print() {
        System.out.println(name + "\t" + english + "\t" + math);
    }

}
