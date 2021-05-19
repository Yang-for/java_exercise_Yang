package com.experiment03;
import java.util.Scanner;

interface ComputerAverage {
    double average(double []data);
}

class Gymnastics implements ComputerAverage {
    public double average(double []data) {
        double sum=0;
        double temp;
        double maxValue, minValue;

        maxValue = data[0];
        minValue = data[0];
        for (double i : data) {
            sum += i;
            if (i > maxValue) {
                maxValue = i;
            }
            else if(i < minValue) {
                minValue = i;
            }
        }
        return (sum-maxValue-minValue)/(data.length-2);
    }
}
class School implements ComputerAverage{
    public double average(double []data){
        double sum = 0;
        for(double i : data) {
            sum += i;
        }
        return sum/data.length;
    }
}

public class Procedure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] data = new double[n];
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextDouble();
        }

        Gymnastics gymnastics = new Gymnastics();
        ComputerAverage computerAverage1 = gymnastics;
        System.out.print("Gymnastics average is:");
        System.out.printf("%.2f\n", computerAverage1.average(data));

        School school = new School();
        ComputerAverage computerAverage2 = school;
        System.out.print("School average is:");
        System.out.printf("%.2f", computerAverage2.average(data));
    }
}