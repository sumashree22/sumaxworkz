package com.xworkz.exceptionhandling;

public class NullPointerException {
    public static void main(String[] args) {
        String s=null;
        try{
        System.out.println(s.length());
    }
        catch(java.lang.NullPointerException b){
            System.out.println("string is null");

        }
    }
}
