package com.internship.basicProgramming.multithreading.webScrapper;

import java.util.concurrent.Callable;

public class ScrapUrl implements Callable<Void> {
    private String url;

    public ScrapUrl(String url) {
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        //System.out.println("Scraping URL: " + this.url);
        Thread.sleep(500); // this is where we're simulating that the web scraping is happening
        return null;
    }
}
