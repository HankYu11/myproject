package com.Tom.SchoolRunner;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student s1 = new Student("Java",59,69);
        s1.print();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入姓名：");
        String name = scanner.next();
        System.out.print("請輸入英文成績：");
        int english = scanner.nextInt();
        System.out.print("請輸入數學成績：");
        int math = scanner.nextInt();
        Student s1 = new Student(name,english,math);
    }
}
