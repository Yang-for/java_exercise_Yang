package com.experiment01;

public class Person {
    private String name;
    private IQ iq;
    public Person(String name, IQ iq) {
        this.name = name;
        this.iq = iq;
    }

    public interface Learnable {
        void read(String bookname);
    }

    public static void main(String[] args) {
        Person.IQ iq = new Person.IQ(250);
        Person person = new Person("Yang", iq);
    }

    public static class IQ {
        private int score;
        public IQ(int score) {
            this.score = score;
        }
    }
}

