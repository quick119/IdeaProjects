package com.quick.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.print("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();
        StudentJ stu = new StudentJ(name, english, math);
        stu.print();
        System.out.println("High score:" + stu.highest());
    }
}
