package com.xworkz.polymorphism.vehicle;



public class BikeTest {
    public static void main(String[] args) {
        System.out.println("--- Transport ---");
        Transport base = new Transport();
        base.start();
        base.move();
        base.fuelUp();
        base.stop();

        System.out.println("\n--- Transport as Bike ---");
        Transport base1 = new Bike();
        base1.start();
        base1.move();
        base1.fuelUp();
        base1.stop();

        System.out.println("\n--- Bike ---");
        Bike child = new Bike();
        child.start();
        child.move();
        child.fuelUp();
        child.stop();
    }
}
