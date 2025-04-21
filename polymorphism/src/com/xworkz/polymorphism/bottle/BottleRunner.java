package com.xworkz.polymorphism.bottle;

public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("--- Bottle ---");
        Bottle base = new Bottle();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Bottle as PlasticBottle ---");
        Bottle base1 = new PlasticBottle();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- PlasticBottle ---");
        PlasticBottle child = new PlasticBottle();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
