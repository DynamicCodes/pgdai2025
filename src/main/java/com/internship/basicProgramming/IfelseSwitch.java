package com.internship.basicProgramming;

import java.util.Scanner;

public class IfelseSwitch {
    public static void main(String[] args) {
        String weather = "snowy";

//        if(weather == "rainy"){
//            System.out.println("Weather is rainy");
//        }else if(weather == "sunny"){
//            System.out.println("Weather is sunny");
//        }else{
//            System.out.println("Weather is not rainy");
//        }
//
//        switch(weather){
//            case "snowy":
//                System.out.println("snowy");
//                break;
//            case "sunny":
//                System.out.println("sunny");
//                break;
//            default:
//                System.out.println("no weather");
//        }
//        switch(weather){
//            case "rainy", "snowy", "sunny", "summer" -> System.out.println("weathers");
//            case "abc", "cbd" -> System.out.println("invalid inputs");
//            default -> System.out.println("enter valid weather");
//        }
        // using if-else or switch, you need take input from user a number (1-7) and print the
        // day associated with that number. example:- user->1, o/p-> Monday........
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Day Number in range 1-7");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Invalid Day");
//        }


        //ternary operator
        String res = (weather == "sunny") ? "Sunny" : (weather == "snowy") ? "snowy" : "no weather";
        System.out.println(res);
    }
}
