package com.internship.basicProgramming;

import java.util.Scanner;

public class LoopQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //question 1: to find one number raised to the power of another
//        System.out.println("Enter the base number: ");
//        int base = sc.nextInt();
//        System.out.println("Enter the exponents: ");
//        int exponents = sc.nextInt();
//
//        int res = 1;
//        for(int i = 1; i<=exponents; i++) {
//            res = res * base;
//
//        }
//        System.out.println("The result is: " + res);
//
////      Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//        System.out.println("SUm of even and odd numbers from user inputs ");
//
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        int even = 0;
//        int odd = 0;
//        while(num != 0){
//            if(num % 2 == 0){
//                even += num;
//            }else{
//                odd += num;
//            }
//
//            num = sc.nextInt();
//        }
//        System.out.println("The sum of even =" + even + " and odd number =" + odd + " is: " + (even + odd));

        //Write a Program to Check Given Number is a Palindrome or Not, 545 = 545
        System.out.println("number checking palindrome or not");
        System.out.println("Enter the number: ");
        int originalNum = sc.nextInt();
        int n = originalNum;

        int rev = 0;
        while(n > 0){
            int lastDigit = n  % 10; // getting the last digit
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        //check the palindrome
        if(rev == originalNum){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }
    }
}
