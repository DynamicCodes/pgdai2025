package com.internship.basicProgramming.multithreading.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value x;
    Lock lock;

    public Subtractor(Value x, Lock lock) {
        this.x = x;
        this.lock = lock;
    }
    private void sub(){
        for(int i=0; i<100_000; i++){
            //synchronized (x) {
            lock.lock();
                x.setX(x.getX() - 1);
                System.out.println("subtracting value : " + x.getX());
           // }
            lock.unlock();
        }
    }

    @Override
    public Void call() throws Exception {
        sub();
        return null;
    }
}
