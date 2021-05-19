package com.experiment06.triangle;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        try{
            triangle(a, b, c);
        } catch (IllegalArgumentException e) {
            System.out.println(e.errorMess());
        }
    }

    public static void triangle(int a, int b, int c) throws IllegalArgumentException{
        if (a + b < c | a < c - b) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(a+" "+b+" "+c);
        }
    }
}
