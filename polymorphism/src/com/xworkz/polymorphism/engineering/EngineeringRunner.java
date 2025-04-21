package com.xworkz.polymorphism.engineering;

public class EngineeringRunner {
    public static void main(String[] args) {
        System.out.println("--- Engineering ---");
        Engineering base = new Engineering();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Engineering as Mechanical ---");
        Engineering base1 = new Mechanical();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- Mechanical ---");
        Mechanical child = new Mechanical();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
