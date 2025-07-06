package com.xworkz.exceptionhandling;

public class ErrorStackOverflow {
    public static void main(String[] args) {
        System.out.println("hhhkff");
        method();
    }
    public static void method(){
        method();
    }
}//this is error at runtime we can handle exception but we cant handle error
