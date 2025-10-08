package com.internship.lms.users;

import java.util.ArrayList;
import java.util.List;

public class Lms {
    // this is the system
    // i need database to store my Books, simulation of book database
    public static List<Book> bookInventory;
    public static List<User> registeredUsers;

    public Lms(){
        bookInventory = new ArrayList<Book>();
        registeredUsers = new ArrayList<>();
    }
    public void addBooks(Book book){
        bookInventory.add(book);
    }
    public void register(User user){
        registeredUsers.add(user);
    }
    public List<Book> searchBooks(String name){
        List<Book> results = new ArrayList<>();
        for(Book b : bookInventory){
            if(b.getName().toLowerCase().contains(name.toLowerCase())){
                results.add(b);
            }
        }
        return results;
    }
    public void displayBooks(){
        for(Book b : bookInventory){
            System.out.println("the book isbn is = " + b.getIsbn() + " the book name is = " + b.getName());
        }
    }
    public void displayUsers(){
        for(User u : registeredUsers){
            System.out.println("the user id is = " + u.getUserId() + " and the name is " + u.getName());
        }
    }
}
