package com.xworkz.polymorphism.drink;



public class Coffee extends Beverage {
    @Override
    public void pour() {
        System.out.println("Coffee: Overriding pour");
    }
    @Override
    public void drink() {
        System.out.println("Coffee: Overriding drink");
    }
    @Override
    public void serve() {
        System.out.println("Coffee: Overriding serve");
    }
    @Override
    public void finish() {
        System.out.println("Coffee: Overriding finish");
    }
}
