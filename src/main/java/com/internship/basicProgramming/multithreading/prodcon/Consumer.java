package com.internship.basicProgramming.multithreading.prodcon;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while(true){
            synchronized(store) {
                try {
                    consumerSemaphore.acquire();
                    if (store.getItems().size() > 0) {
                        store.removeItem();
                    }
                    producerSemaphore.release();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
