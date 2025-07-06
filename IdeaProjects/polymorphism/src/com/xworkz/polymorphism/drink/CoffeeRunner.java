package com.xworkz.polymorphism.drink;



public class CoffeeRunner {
    public static void main(String[] args) {
        System.out.println("--- Beverage ---");
        Beverage base = new Beverage();
        base.pour();
        base.drink();
        base.serve();
        base.finish();

        System.out.println("\n--- Beverage as Coffee ---");
        Beverage base1 = new Coffee();
        base1.pour();
        base1.drink();
        base1.serve();
        base1.finish();

        System.out.println("\n--- Coffee ---");
        Coffee child = new Coffee();
        child.pour();
        child.drink();
        child.serve();
        child.finish();
    }
}
