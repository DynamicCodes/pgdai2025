package com.internship.lms.users;

public class Member extends User {
    private int totalIssue;
    private int issued = 0;

    public Member(String name) {
        super(name);
    }

    @Override
    public void userDashboard() {
        System.out.println("the memeber id is " + getUserId());
        System.out.println("the member name is " + getName());
    }

    @Override
    public boolean canLend() {
        if(issued < totalIssue) {
            return true;
        }
        return false;
    }

    public int getTotalIssue() {
        return totalIssue;
    }

    public void setTotalIssue(int totalIssue) {
        this.totalIssue = totalIssue;
    }

    public int getIssued() {
        return issued;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }
}
