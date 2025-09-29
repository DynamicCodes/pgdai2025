package com.internship.basicProgramming.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fibonacci implements Callable<Integer>{
    int n;
    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        if(n <= 1) return n;
        System.out.println("thread is executing in " + Thread.currentThread().getName());
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> firstFuture = executor.submit(new Fibonacci(n-1));
        Future<Integer> secondFuture = executor.submit(new Fibonacci(n-2));

        int x = firstFuture.get();
        int y = secondFuture.get();
        return x+y;
    }
}
