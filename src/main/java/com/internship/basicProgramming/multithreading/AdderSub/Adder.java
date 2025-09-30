package com.internship.basicProgramming.multithreading.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    Value x;
    Lock lock;

    public Adder(Value x, Lock lock) {
        this.x = x;
        this.lock = lock;
    }
    private void add(){
        for(int i=0; i<100_000; i++){
            //synchronized (x) {   // this is synchronized block example
            lock.lock();  // this is using your own locking  mechanism.
                x.setX(x.getX() + 1);  // this is the critical section we should be handling carefully
                System.out.println("Added value : " + x.getX());
            //}
            lock.unlock();
        }
    }


    @Override
    public Void call() throws Exception {
        add();
        return null;
    }
}
