package com.internship.basicProgramming.oops;

//Create a Calculator class that performs basic mathematical operations.
//Requirements:
//Create a Calculator class with two instance variables: num1 and num2
//Implement a default constructor that sets both numbers to 0
//Implement a parameterized constructor that accepts two numbers
//Create methods: add(), subtract(), multiply(), and divide()
//Include getter and setter methods for both numbers
//Write a main method that creates 2 Calculator objects and demonstrates all operations

class Calculator {
    int num1;
    int num2;

    Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }
    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    void add(){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    void sub(){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    void mul(){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    void div(){
        System.out.println(num1 / num2 + " = " + (num1 / num2));
    }
    void reset(){
        this.num1 = 0;
        this.num2 = 0;
    }
    void currentvalueDisplay(){
        System.out.println("Num1 is " + num1);
        System.out.println("Num2 is " + num2);
    }


    // getter and setter methods for geeting a value or setting a value
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}




public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.setNum1(1);
        calc1.setNum2(2);
        calc1.add();

        Calculator calc2 = new Calculator(3,4);
        calc2.mul();
        calc2.currentvalueDisplay();
        calc2.reset();
        calc2.currentvalueDisplay();
    }
}
