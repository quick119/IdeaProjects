package com.quick.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        StudentJ stu = new StudentJ("Hank", 77, 99);
        stu.print();
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
