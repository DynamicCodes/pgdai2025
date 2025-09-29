package com.internship.basicProgramming.multithreading;

import com.internship.basicProgramming.multithreading.webScrapper.ScrapUrl;

import java.util.ArrayList;
import java.util.List;
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
//        ExecutorService executor = Executors.newCachedThreadPool();
//        Future<Integer> ansFuture = executor.submit(new Fibonacci(55));
//        System.out.println(ansFuture.get());
//        executor.shutdown();

        // 4th program, simulating web scraping through thread.sleep
        List<String> urls = new ArrayList<>();
        for(int i=0; i<1000; i++){
            urls.add("http://example.com/page"+i);
        }
        ExecutorService es1 = Executors.newFixedThreadPool(100);
        ExecutorService es2 = Executors.newCachedThreadPool();

        // this is for FixedThreadPool
        long startTime  = System.currentTimeMillis();
        executeWebScraping(urls, es1);
        long endTime  = System.currentTimeMillis();
        System.out.println("Time taken for the processing with fixedThread Pool : " + (endTime - startTime));


        // this is for CachedThreadPool
        long startTime1  = System.currentTimeMillis();
        executeWebScraping(urls, es2);
        long endTime1  = System.currentTimeMillis();
        System.out.println("Time taken for the processing with cachedThreadPool: " + (endTime1 - startTime1));





    }
    public static void executeWebScraping(List<String> urls, ExecutorService es) throws InterruptedException, ExecutionException {
        List<Future<Void>> futures = new ArrayList<>();

        for(String url : urls)
        {
            futures.add(es.submit(new ScrapUrl(url)));
        }
        for(Future<Void> future : futures){
            future.get();
        }

    }
}
