package com.test;


public class A {
    private String name;

    public A() {
        System.out.println("1");
    }

    public A(String name) {
        this.name = name;
        System.out.println("2");
    }
}

class B extends A{

    private A a;

    public B() {
        System.out.println("3");
    }

    public B(String name) {
        System.out.println("4");
        a = new A("5");
    }
}

