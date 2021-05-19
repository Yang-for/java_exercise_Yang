package com.experiment03;
import java.util.Scanner;

public class Biology {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputAnimal = input.nextLine();
        String [] arrayAnimal = inputAnimal.split(" ");

        Cat cat = new Cat(arrayAnimal[0]);
        Mouse mouse = new Mouse(arrayAnimal[1]);

        cat.speak();
        mouse.speak();
    }

    public static class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void speak() {
        }
    }

    public static class Mouse extends Animal{
        public Mouse(String name) {
            super(name);
        }

        public void speak() {
            System.out.println(super.getName()+"的叫声为吱吱");
        }
    }

    public static class Cat extends Animal{
        public Cat(String name) {
            super(name);
        }

        public void speak() {
            System.out.println(super.getName()+"的叫声为喵喵");
        }
    }
}
