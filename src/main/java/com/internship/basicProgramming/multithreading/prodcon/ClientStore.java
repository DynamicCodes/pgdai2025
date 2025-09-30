package com.internship.basicProgramming.multithreading.prodcon;

import java.util.concurrent.Semaphore;

public class ClientStore {
    public static void main(String[] args) {

        Store store = new Store(10);
        Semaphore producerSemaphore = new Semaphore(10);
        Semaphore consumerSemaphore = new Semaphore(0);

        for(int i=0; i<9; i++){
            Producer producer = new Producer(store, producerSemaphore, consumerSemaphore);
            new Thread(producer).start();
        }
        for(int i=0; i<20; i++){
            Consumer consumer = new Consumer(store, consumerSemaphore, producerSemaphore);
            new Thread(consumer).start();
        }
    }
}
