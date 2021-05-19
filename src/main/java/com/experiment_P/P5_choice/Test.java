package com.experiment_P.P5_choice;

public class Test {
    public static void main(String[] args) {
        I i = new S();

        F f = (F) i;

        S s = (S) f;

        s.getI();
    }
}
