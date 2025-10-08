package com.internship.lms.users;

public class Textbook extends Book{
    private String subject;

    public Textbook(int isbn, String name, String subject){
        super(isbn, name);
        this.subject = subject;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Book Details");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Name: " + getName());
        System.out.println("Subject: " + subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
