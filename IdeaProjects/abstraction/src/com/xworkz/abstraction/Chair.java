package com.xworkz.abstraction;

public class Chair {
    int a;
    int b;
    private Chair( int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a);
        System.out.println(b);

    }

    public static Chair initialize( int a,int b){
       return new Chair(a,b);

    }

}
