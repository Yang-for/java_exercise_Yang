package com.experiment03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputDog1 = input.nextLine();
        String [] arrayDog1 = inputDog1.split(" ");

        SpottedDog dog1 = new SpottedDog(arrayDog1[0], arrayDog1[1], arrayDog1[2],
                arrayDog1[3]);

        String inputDog2 = input.nextLine();
        String [] arrayDog2 = inputDog2.split(" ");

        UnspottedDog dog2 = new UnspottedDog(arrayDog2[0], arrayDog2[1], arrayDog1[2]);

        dog1.getSuper();
        dog1.show();
        dog2.show();

    }

    public static class Dog {
        private String breed;
        private String weight;
        private String color;

        public Dog(String breed, String weight, String color){
            this.breed = breed;
            this.weight = weight;
            this.color = color;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void show() {
            System.out.println("这是一只"+breed+"体重为"+weight+",颜色为"+color);
        }
    }

    public static class UnspottedDog extends Dog {
        public UnspottedDog(String breed, String weight, String color) {
            super(breed, weight, color);
        }

        public void show() {
            System.out.println("这是一只"+ this.getBreed()+"犬");
        }

    }

    public static class SpottedDog extends Dog {
        private String spotColor;
        public SpottedDog(String breed, String weight, String color, String spotColor) {
            super(breed, weight, color);
            this.spotColor = spotColor;
        }

        public void show() {
            System.out.println("这是一只"+this.getBreed()+",颜色为"+this.getColor()
                    +",斑点颜色为"+spotColor);
        }

        public void getSuper() {
            super.show();
        }
    }
}
