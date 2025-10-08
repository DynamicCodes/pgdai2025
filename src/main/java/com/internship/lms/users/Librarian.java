package com.internship.lms.users;

public class Librarian extends User {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void userDashboard() {
        System.out.println("the librarian id is " + getUserId());
        System.out.println("the librarian name is " + getName());
    }

    @Override
    public boolean canLend() {
        return true;
    }

}
