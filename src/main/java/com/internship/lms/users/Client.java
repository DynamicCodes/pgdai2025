package com.internship.lms.users;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Novel n1 = new Novel(123,"Time Flies", "Fantasy");
        Novel n2 = new Novel(124,"Time remembers", "Horror");
        Novel n3 = new Novel(125,"Right Time to Die", "Romantic");
        Textbook t1 = new Textbook(145678,"Chemistry", "Molecular");
        Textbook t2 = new Textbook(145892,"maths", "mathematics");

        User u1 = new Librarian("David");
        Member m1 = new Member("chaitanya");

        Lms lms = new Lms();
        lms.addBooks(n1);
        lms.addBooks(n2);
        lms.addBooks(n3);
        lms.addBooks(t1);
        lms.addBooks(t2);

        lms.register(u1);
        lms.register(m1);

        lms.displayBooks();
        lms.displayUsers();

        n1.lend(m1);
        n1.isAvailable();
        n2.isAvailable();
        n1.returnBook(m1);
        n1.isAvailable();

        System.out.println("The total users in the system is " + User.total_users);
        // search for any Book

        System.out.println();
        System.out.println("Searching a Book in the DB");
        List<Book> searchedBooks = lms.searchBooks("Time");
        for(Book b : searchedBooks) {
            System.out.println("the book you are looking for is " + b.getName());
        }
    }
}
