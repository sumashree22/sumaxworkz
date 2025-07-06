package com.xworkz.polymorphism.bird;

public class Parrot extends Bird {
    @Override
    public void eat() {
        System.out.println("Parrot: Overriding eat");
    }
    @Override
    public void sleep() {
        System.out.println("Parrot: Overriding sleep");
    }
    @Override
    public void fly() {
        System.out.println("Parrot: Overriding fly");
    }
    @Override
    public void chirp() {
        System.out.println("Parrot: Overriding chirp");
    }
}
