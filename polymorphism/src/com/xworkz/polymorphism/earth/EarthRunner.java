package com.xworkz.polymorphism.earth;

public class EarthRunner {
    public static void main(String[] args) {
        System.out.println("--- Earth ---");
        Earth base = new Earth();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Earth as Continent ---");
        Earth base1 = new Continent();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- Continent ---");
        Continent child = new Continent();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
