package com.experiment03;

import java.util.Scanner;

public class Transport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputTransport = input.nextLine();
        String [] arrayTransport = inputTransport.split(" ");

        double valueDouble1 = Double.parseDouble(arrayTransport[1]);
        double valueDouble2 = Double.parseDouble(arrayTransport[3]);
        double valueDouble3 = Double.parseDouble(arrayTransport[6]);
        double valueDouble4 = Double.parseDouble(arrayTransport[8]);

        Vehicle transport1 = new Vehicle(arrayTransport[0], valueDouble1);
        Car transport2 = new Car(arrayTransport[2], valueDouble2, arrayTransport[4]);
        Truck transport3 = new Truck(arrayTransport[5], valueDouble3, arrayTransport[7],
                valueDouble4);

        transport1.show();
        transport2.show();
        transport3.show();
    }

    public static class Vehicle {
        private String wheel;
        private double weight;

        public Vehicle(String wheel, double weight) {
            this.wheel = wheel;
            this.weight = weight;
        }

        public String getWheel() {
            return wheel;
        }

        public void setWheel(String wheel) {
            this.wheel = wheel;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void show() {
            System.out.println("汽车:\n"+"轮子数:"+wheel+"个\n"+"自身重量:"+weight+"吨");
        }
    }

    public static class Car extends Vehicle{
        private String carryPassengers;
        public Car(String wheel, double weight, String carryPassengers) {
            super(wheel, weight);
            this.carryPassengers = carryPassengers;
        }

        public void show() {
            System.out.println("小轿车:\n"+"轮子数:"+this.getWheel()+"个\n"+"自身重量:"
                    +this.getWeight()+"吨\n"+"额定乘客数"+carryPassengers+"人");
        }
    }

    public static class Truck extends Vehicle {
        private String carryPassengers;
        private double carryWeight;

        public Truck(String wheel, double weight, String carryPassengers, double carryWeight) {
            super(wheel, weight);
            this.carryPassengers = carryPassengers;
            this.carryWeight = carryWeight;
        }

        public void show() {
            System.out.println("卡车:\n"+"轮子数:"+this.getWheel()+"个\n"+"自身重量:"
                    +this.getWeight()+"吨\n"+"额定乘客数"+carryPassengers+"人\n"+"载货量"
                    +carryWeight+"吨");
        }
    }
}
