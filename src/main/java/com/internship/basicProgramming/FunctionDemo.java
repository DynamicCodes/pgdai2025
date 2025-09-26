package com.internship.basicProgramming;

public class FunctionDemo {
    public static void main(String[] args) {
        int x = 10;

        hello();
        Demo.print();
        System.out.println(name("cdac"));
        int num = 10;
        int n = modifier(num);
        System.out.println("OG value " + num);
        System.out.println("returned value " + n);

        int[] arr = {1,2,3};
        arrayModifier(arr);
        for(int i: arr){
            System.out.println(i);
        }

    }
    static void hello(){
        System.out.println("Hello world");
    }
    static String name(String firstName){
        return firstName;
    }
    static String name(String firstName, String lastName){
        return firstName;
    }
    static int modifier(int num){
        num += 1;
        System.out.println(num);
        return num;
    }
    static int[] arrayModifier(int[] arr){
        arr[0] = 10;
        return arr;
    }

}
class Demo{
    static void print(){
        System.out.println("another class");
    }
}
