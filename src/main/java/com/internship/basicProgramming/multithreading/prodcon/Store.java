package com.internship.basicProgramming.multithreading.prodcon;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ConcurrentLinkedQueue<>();
    }

    // adding items
    public void addItem(Object item){
        items.add(item);
        if(items.size() > 10){
            System.out.println("Producer has added an item to the store  " + items.size());
        }
    }
    public void removeItem(){
        items.remove(items.size()-1); // removinf from the last
        System.out.println("consumer has consumed " + items.size());
    }



    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void setItems(ConcurrentLinkedQueue<Object> items) {
        this.items = items;
    }
}
