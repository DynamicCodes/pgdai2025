package com.internship.basicProgramming;

public class Loops {
    public static void main(String[] args) {
        //For loop
        for(int i=1; i<=20; i++){
            System.out.println("the value is : " + i);
        }
        //while loop
        int i = 1;
        while(i<=10){
            System.out.println("the value is : " + i);
            i++;
        }
        // do while loop
        int j = 1;
        do{
            System.out.println("the value is : " + j);
            j++;
        }while(j<=10);
    }
}
