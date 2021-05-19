package com.homework04.entity;

public class Commodity {
    private String commodity_Name;
    private double commodity_Price;

    public Commodity(String name, double price) {
        commodity_Name = name;
        commodity_Price = price;
    }

    public void setCommodity_Name(String name) {
        commodity_Name = name;
    }

    public String getCommodity_Name() {
        return commodity_Name;
    }

    public void setCommodity_Price(double price) {
        commodity_Price = price;
    }

    public double getCommodity_Price() {
        return commodity_Price;
    }
}
