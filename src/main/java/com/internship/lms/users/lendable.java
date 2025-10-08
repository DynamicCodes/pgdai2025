package com.internship.lms.users;

public interface lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
