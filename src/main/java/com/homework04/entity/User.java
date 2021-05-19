package com.homework04.entity;

public class User {
    private String user_Name;
    private double user_Balance;

    public User (String name, double balance) {
        user_Name = name;
        user_Balance = balance;
    }

    public void setUser_Name(String name) {
        user_Name = name;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Balance(double balance) {
        user_Balance = balance;
    }

    public double getUser_Balance() {
        return user_Balance;
    }
}
