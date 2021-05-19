package com.experiment_P.p5;

public class Test {
    public static void main(String[] args) {
        View.Button buttonA = new View.Button("ButtonA");
        View.Button buttonB = new View.Button("ButtonB");

        buttonA.setClickable(new Clickable() {
            public void click() {
                System.out.println("ButtonA");
            }
        });

        buttonB.setClickable(new Clickable() {
            public void click() {
                System.out.println("ButtonB");
            }
        });

        buttonA.getLearnable().click();
        buttonB.getLearnable().click();
    }
}
