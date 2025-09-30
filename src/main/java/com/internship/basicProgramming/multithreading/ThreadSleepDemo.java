package com.internship.basicProgramming.multithreading;

class SleepDemo extends Thread {
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Deamon thread executing");
        }
        else{
            System.out.println("user thread executing");
        }
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}


public class ThreadSleepDemo {
    public static void main(String[] args) {
        SleepDemo demo1 = new SleepDemo();
        SleepDemo demo2 = new SleepDemo();
        demo1.setDaemon(true);  // low priority thread
        demo1.start();
        demo2.start();
    //  Daemon thread


        // setting priority
//        demo1.setPriority(Thread.MAX_PRIORITY);
//        demo2.setPriority(Thread.MIN_PRIORITY);  // thread static value for priority
//
//        demo1.setPriority(9);  //integer value for setting priority
//        demo2.setPriority(1);


        //demo1.setName("CDAC");
        System.out.println(demo1.getName());
    }
}
