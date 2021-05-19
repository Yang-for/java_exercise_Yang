package com.experiment02;

public class Student {
    private String name;
    private int age;
    private int no;

    public Student(String name, int age, int no) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student stu = new Student("Yang", 20, 123456);
        System.out.println("Name:"+stu.name+" Age:"+stu.getAge()+" No:"+stu.no);
    }
}
