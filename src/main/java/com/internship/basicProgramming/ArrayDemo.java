package com.internship.basicProgramming;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int mark1 = 10;
        int mark2 = 20;
        int mark3 = 30;

        Scanner sc = new Scanner(System.in);

        int[] marks = {10,20,30};

        System.out.println(marks.length); // checking the length

        //print the array
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("taking input in the array");
        int[] arr2 = new int[5];
    // taking the input in the arrray.
        for(int i=0; i<arr2.length; i++){
            System.out.println("enter the " + (i+1) + "th number");
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        //linear search
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] == 30){
                System.out.println("value found");
                break;
            }
        }

        // for each loop
        for(int n : arr2){
            System.out.println(n);
        }

    }
}
