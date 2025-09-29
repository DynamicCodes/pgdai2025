package com.internship.basicProgramming.multithreading;

public class HelloWorldPrinter implements Runnable {
    public void run() {
        print();
    }
    public void print(){
        System.out.println("Hello World");
        System.out.println("The thread name is " + Thread.currentThread().getName());
    }
}
