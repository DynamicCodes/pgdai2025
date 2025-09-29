package com.internship.basicProgramming.multithreading;



class Basic extends Thread {
    public void run() {
        print();
    }

    public void print(){
        System.out.println("Basic Thread is running");
    }

}
class Complex implements Runnable{

    @Override
    public void run() {
        print();
    }
    public void print(){
        System.out.println("Complex Thread is running");
    }

}
public class BasicthreadDemo {
    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.start();

        Thread t1 = new Thread(basic);
        t1.start();

        // obj of complex
        //Complex complex = new Complex();
        Thread t2 = new Thread(new Complex());
        t2.start();

    }
}
