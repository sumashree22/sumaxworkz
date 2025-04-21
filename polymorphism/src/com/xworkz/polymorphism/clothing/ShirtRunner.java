package com.xworkz.polymorphism.clothing;

public class ShirtRunner {
    public static void main(String[] args) {
        System.out.println("--- Apparel ---");
        Apparel base = new Apparel();
        base.wear();
        base.wash();
        base.fold();
        base.dry();

        System.out.println("\n--- Apparel as Shirt ---");
        Apparel base1 = new Shirt();
        base1.wear();
        base1.wash();
        base1.fold();
        base1.dry();

        System.out.println("\n--- Shirt ---");
        Shirt child = new Shirt();
        child.wear();
        child.wash();
        child.fold();
        child.dry();
    }
}
