package com.xworkz.polymorphism.oxygen;

public class OxygenRunner {
    public static void main(String[] args) {
        System.out.println("--- Oxygen ---");
        Oxygen base = new Oxygen();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Oxygen as OxygenMolecule ---");
        Oxygen base1 = new OxygenMolecule();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- OxygenMolecule ---");
        OxygenMolecule child = new OxygenMolecule();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
