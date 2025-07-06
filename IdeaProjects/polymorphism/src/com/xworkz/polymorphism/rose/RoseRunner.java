package com.xworkz.polymorphism.rose;

public class RoseRunner {
    public static void main(String[] args) {
        System.out.println("--- Rose ---");
        Rose base = new Rose();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Rose as RedRose ---");
        Rose base1 = new RedRose();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- RedRose ---");
        RedRose child = new RedRose();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
