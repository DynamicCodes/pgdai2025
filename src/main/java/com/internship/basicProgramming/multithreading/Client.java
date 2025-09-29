package com.internship.basicProgramming.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.Helloworld printer thread program
//         Thread t1 = new Thread(new HelloWorldPrinter());
//         t1.start();
//         Thread t2 = new Thread(new HelloWorldPrinter());
//         t2.start();
//
//         HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//         helloWorldPrinter.run();
//
//         // this is second program, for number printer
//        // with cahced thread pool, race condition is happening
//        ExecutorService es = Executors.newCachedThreadPool();
//        for(int i=1; i<=1000_000; i++){
//            es.execute(new NumberPrinter(i));
//        }

        //3. program of fibonacci series
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> ansFuture = executor.submit(new Fibonacci(15));
        System.out.println(ansFuture.get());
        executor.shutdown();


    }
}
