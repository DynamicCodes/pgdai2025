package com.internship.lms.users;

public abstract class User {
    private String userId;
    private String name;
    public static int total_users = 0;

    public User(String name) {
        this.userId = generateUniqueId();
        this.name = name;
    }
    private String generateUniqueId() {
        return "user" + String.valueOf(++total_users);
    }
    public abstract void userDashboard();
    public abstract boolean canLend();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotal_users() {
        return total_users;
    }

    public static void setTotal_users(int total_users) {
        User.total_users = total_users;
    }
}
