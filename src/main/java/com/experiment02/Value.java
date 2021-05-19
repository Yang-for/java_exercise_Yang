package com.experiment02;

import java.util.Scanner;

public class Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInt1 = input.nextInt();
        int numInt2 = input.nextInt();
        double numDouble1 = input.nextDouble();
        double numDouble2 = input.nextDouble();
        double numDouble3 = input.nextDouble();
        String str1 = input.next();
        String str2 = input.next();

        Caculate object1 = new Caculate(numInt1,numInt2);
        Caculate object2 = new Caculate(numDouble1, numDouble2, numDouble3);
        Caculate object3 = new Caculate(str1, str2);

        System.out.println(object1.getMax(numInt1, numInt2));
        System.out.println(object2.doubleTimes(numDouble1, numDouble2, numDouble3));
        System.out.println(object3.isEqual(str1, str2));

    }
    public static class Caculate {
        private int numInt1, numInt2;
        private double numDouble1, numDouble2, numDouble3;
        private String str1, str2;

        public Caculate(int numInt1, int numInt2) {
             this.numInt1 = numInt1;
             this.numInt2 = numInt2;
        }

        public Caculate(double num1, double num2, double num3) {
            numDouble1 = num1;
            numDouble2 = num2;
            numDouble3 = num3;
        }

        public Caculate(String str1, String str2) {
            this.str1 = str1;
            this.str2 = str2;
        }

        public int getMax(int num1, int num2) {
            return Math.max(num1, num2);
        }

        public double doubleTimes(double num1, double num2, double num3) {
            return num1*num2*num3;
        }

        public Boolean isEqual(String str1, String str2){
            return str1.equals(str2);
        }
    }
}


