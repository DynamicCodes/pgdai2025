package com.internship.basicProgramming;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // CREATE A STRINGbUILDER

        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("World");
        StringBuffer s3 = new StringBuffer("Hello");

        // append
        s1.append(s2);
        System.out.println(s1);
        System.out.println(s2);

        // insert
        s1.insert(10, "java programmers");
        System.out.println(s1);

        // replace
        s1.replace(10,14," python-anaconda");
        System.out.println(s1);

        //delete
        s1.delete(10,14);
        System.out.println(s1);

        //reverse
        s1.reverse();
        System.out.println(s1);
    }
}
