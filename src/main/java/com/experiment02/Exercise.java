package com.experiment02;

import java.util.Scanner;

public class Exercise {
    public static class Dog {
        private String name;
        private String color;
        private int age;

        public Dog() {
        }

        public Dog(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dogName = input.next();
        String dogColor = input.next();
        int dogAge = input.nextInt();

        Dog dog1 = new Dog();
        dog1.name = "dog1";
        dog1.color = "white";
        dog1.age = 1;

        Dog dog2 = new Dog(dogName, dogColor, dogAge);

        System.out.println("name="+dog1.getName()+",color="+dog1.getColor()+",age="+dog1.getAge());
        System.out.println("name="+dog2.getName()+",color="+dog2.getColor()+",age="+dog2.getAge());
    }
}
