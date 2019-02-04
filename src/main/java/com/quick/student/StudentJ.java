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
        System.out.print(name + "\t" + english + "\t" + math +
                "\t" + getAverage());
        if (getAverage() >= 60) {
            System.out.println("\tPASS");
        }else{
            System.out.println("\tFAILED");
        }
    }

    public int  getAverage() {
        return (english+math)/2;
    }

}
