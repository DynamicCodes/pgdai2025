package com.internship.basicProgramming.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void validateAge(int age) {
        if(age < 18) {
            // use of throw keyword
            throw new IllegalArgumentException("Age must be at least 18");
        }
        System.out.println("valid age: " + age);
    }
    public static void readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
        BufferedReader reader = new BufferedReader(file);
        System.out.println(reader.readLine());
        reader.close();
    }


    public static void main(String[] args) {
//        try {
//            String str = "abc";
//            int result = 100 / 0;
//            System.out.println(result);
//            System.out.println("length of string: " + str.length());
//            int i = Integer.parseInt(str);
//            int[] ar = new int[1];
//            ar[10] = 1;
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("I will run even though there is an exception");
//        }

        // handling the exception in the main block for age validation
        try{
            validateAge(12);
        }catch(IllegalArgumentException e) {
            System.out.println(e);
        }

        // use of throws
        try {
            readFile("test.txt");
        }catch(Exception e) {
            System.out.println(e);
        }finally {

        }

        System.out.println("The program continues.....");
    }
}
