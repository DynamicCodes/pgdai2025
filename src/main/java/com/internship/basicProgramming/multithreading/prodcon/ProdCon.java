package com.internship.basicProgramming.multithreading.prodcon;

class Buffer{
    private int data;
    private boolean empty = true;

    public synchronized void put(int value) throws InterruptedException {
        while(!empty){
            wait();
        }
        data = value;
        empty = false;
        System.out.println("produced : " + value);
        notify();
    }
    public synchronized int get() throws InterruptedException {
        while(empty) wait();
        empty = true;
        System.out.println("consumed " + data);
        notify();
        return data;
    }
}



public class ProdCon {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread producer = new Thread(() -> {
            for(int i=0; i<3; i++){
                try {
                    buffer.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumer = new Thread(() -> {
            for(int i=0; i<3; i++){
                try {
                    buffer.get();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
