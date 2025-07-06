package com.xworkz.exceptionhandling;

public class AirthmaticExceptionRunner {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;

        }catch(ArithmeticException e){
            System.out.println("cant divide by Zero error");
        }
    }
}
