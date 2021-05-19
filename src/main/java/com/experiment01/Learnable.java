package com.experiment01;

public interface Learnable {
    void read();
}

class Student {
    private String name;
    private Learnable learnable;

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Yang");
        s1.setLearnable(new Learnable() {
            public void read() {
                System.out.println("我要按自己的方式阅读");
            }

        });
    }

    private void setLearnable(Learnable 我要按自己的方式阅读) {
    }
}
