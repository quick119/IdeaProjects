package com.quick.student;

public class StudentJ {
    String name;
    int english;
    int math;

    public StudentJ(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
        return (math > english) ? math : english;
    }

    public void print() {
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2);
    }

}
