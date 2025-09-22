package com.internship.basicProgramming;

import java.util.Scanner;

public class scannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int n = sc.nextInt();
//        System.out.println("the value entered is: " + n);


        System.out.println("Enter the String:");
        String name = sc.nextLine();
        System.out.println("the value entered is: " + name);

        System.out.println("Enter the boolean value:");
        boolean bool = sc.nextBoolean();
        System.out.println("the value entered is: " + bool);

        //to create a student details program, where you need to take input from user of student name, age, school name,
        // student is pass or fail.
        // print all the details.
    }
}
