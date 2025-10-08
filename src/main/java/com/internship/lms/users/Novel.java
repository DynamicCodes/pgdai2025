package com.internship.lms.users;

public class Novel extends Book{
    private String genre;

    public Novel(int isbn, String name, String genre) {
        super(isbn, name);
        this.genre = genre;
    }


    @Override
    public void displayBookDetails() {
        System.out.println("Book Details");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Name: " + getName());
        System.out.println("Genre: " + genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
