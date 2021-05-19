package com.experiment02;

import java.util.Scanner;

public class Caculate {
    private double l;
    private double w;
    private double h;

    public Caculate(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l = input.nextDouble();
        double w = input.nextDouble();
        double h = input.nextDouble();

        rectangle(l, w, h);

    }

    public static void rectangle(double l, double w, double h) {
        System.out.println(2*(l*w+l*h+w*h));
        System.out.println(l*w*h);
    }
}
