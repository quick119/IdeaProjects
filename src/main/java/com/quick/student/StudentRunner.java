package com.quick.student;

import com.kotlin.Student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        com.kotlin.Student.getPass();   //透過@JvmStatic可取得kotlin版的pass分數

        StudentJ.pass = 60;
        StudentJ stu = new StudentJ("Hank", 97, 10);
        StudentJ stu2 = new StudentJ("Eric", 60, 40);
        StudentJ stu3 = new StudentJ("Jane", 30, 55);
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }

    private static void userInput() {
        System.out.print("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();
        StudentJ stu = new StudentJ(name, english, math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}
