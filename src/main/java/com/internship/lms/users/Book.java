package com.internship.lms.users;

public abstract class Book implements lendable{
    private int isbn;
    private String name;
    private boolean isAvailable;

    public Book(int isbn, String name) {
        this.isbn = isbn;
        this.name = name;
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user){
        if(isAvailable){
            isAvailable = false;
            System.out.println("the Book " + this.name + " is lended to user " + user.getName());
            return true;
        }
        System.out.println("The book is not available");
        return false;
    }
    @Override
    public void returnBook(User user){
        System.out.println("the Book " + this.name + " is returned to user " + user.getName());
        isAvailable = true;
    }
    @Override
    public boolean isAvailable() {
        if(isAvailable){
            System.out.println("the Book " + this.name + " is available");
            return true;
        }
        System.out.println("The book " + this.name + " is not available");
        return false;
    }
    public abstract void displayBookDetails();

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
