package com.xworkz.polymorphism.vehicle;



public class Bike extends Transport {
    @Override
    public void start() {
        System.out.println("Bike: Overriding start");
    }
    @Override
    public void move() {
        System.out.println("Bike: Overriding move");
    }
    @Override
    public void fuelUp() {
        System.out.println("Bike: Overriding fuelUp");
    }
    @Override
    public void stop() {
        System.out.println("Bike: Overriding stop");
    }
}
