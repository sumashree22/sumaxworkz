package com.xworkz.polymorphism.sun;

public class SunRunner {
    public static void main(String[] args) {
        System.out.println("--- Sun ---");
        Sun base = new Sun();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Sun as SolarFlare ---");
        Sun base1 = new SolarFlare();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- SolarFlare ---");
        SolarFlare child = new SolarFlare();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
