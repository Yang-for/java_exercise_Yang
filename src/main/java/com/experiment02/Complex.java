package com.experiment02;

import java.util.*;

public class Complex {
    private double a = 0;
    private double b = 0;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(Complex complex) {
        this.a = complex.a;
        this.b = complex.b;
    }

    public void Print() {
        if (a == 0 && b == 0)
            System.out.println(0);
        else
            System.out.println(a+"+"+b+"i");
    }

    public Complex Add(Complex complex) {
        this.a += complex.a;
        this.b += complex.b;

        return this;
    }

    public Complex Sub(Complex complex) {
        this.a -= complex.a;
        this.b -= complex.b;

        return this;
    }

    public static void main(String[] args) {
        int m,n;    //第一个数的实部和虚部
        int p,q;    //第二个数的实部和虚部
        Scanner scanner =new Scanner(System.in);
        m=scanner.nextInt();
        n=scanner.nextInt();
        p=scanner.nextInt();
        q=scanner.nextInt();
        Complex t =new Complex(m,n);
        Complex s =new Complex(t);
        Complex r=new Complex(p,q);
        (s.Add(r)).Print();
        (t.Sub(r)).Print();
    }
}
