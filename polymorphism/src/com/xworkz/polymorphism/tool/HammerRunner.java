package com.xworkz.polymorphism.tool;



public class HammerRunner {
    public static void main(String[] args) {
        System.out.println("--- Utility ---");
        Utility base = new Utility();
        base.grab();
        base.hit();
        base.fix();
        base.store();

        System.out.println("\n--- Utility as Hammer ---");
        Utility base1 = new Hammer();
        base1.grab();
        base1.hit();
        base1.fix();
        base1.store();

        System.out.println("\n--- Hammer ---");
        Hammer child = new Hammer();
        child.grab();
        child.hit();
        child.fix();
        child.store();
    }
}
