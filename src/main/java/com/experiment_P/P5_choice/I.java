package com.experiment_P.P5_choice;

public interface I {
    void getI();
}

class F implements I {
    public void getF() {
        System.out.println("F getF");
    }

    @Override
    public void getI() {
        System.out.println("F getI");
    }
}

class S extends F {
    public void getS() {
        System.out.println("S getS");
    }

    @Override
    public void getF() {
        System.out.println("S getF");
    }

    @Override
    public void getI() {
        System.out.println("S getI");
    }

}