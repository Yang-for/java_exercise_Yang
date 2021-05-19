package com.experiment06.triangle;

public class IllegalArgumentException extends Exception{
    final String message = "a,b,c不能构成三角形";
    public String errorMess() {
        return message;
    }
}
