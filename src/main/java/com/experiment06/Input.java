package com.experiment06;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            System.out.println(10-n);
        } catch (RuntimeException r) {
            System.out.println("not int");
        } finally {
            System.out.println("end");
        }
    }
}
