package com.experiment01;

import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += a * (Math.pow(10, i));
        }
        System.out.println(sum);
    }
}





