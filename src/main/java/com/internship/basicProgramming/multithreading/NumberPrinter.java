package com.internship.basicProgramming.multithreading;

public class NumberPrinter implements Runnable {
    private int number;
    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Numbers to print: " + number + " printed by " + Thread.currentThread().getName());
    }
}
