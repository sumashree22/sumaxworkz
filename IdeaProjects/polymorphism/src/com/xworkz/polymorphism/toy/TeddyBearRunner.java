package com.xworkz.polymorphism.toy;


public class TeddyBearRunner {
    public static void main(String[] args) {
        System.out.println("--- Object ---");
        Object base = new Object();
        base.hold();
        base.shake();
        base.drop();
        base.store();

        System.out.println("\n--- Object as TeddyBear ---");
        Object base1 = new TeddyBear();
        base1.hold();
        base1.shake();
        base1.drop();
        base1.store();

        System.out.println("\n--- TeddyBear ---");
        TeddyBear child = new TeddyBear();
        child.hold();
        child.shake();
        child.drop();
        child.store();
    }
}
