package com.xworkz.polymorphism.furniture;


public class ChairRunner {
    public static void main(String[] args) {
        System.out.println("--- Item ---");
        Item base = new Item();
        base.place();
        base.use();
        base.clean();
        base.move();

        System.out.println("\n--- Item as Chair ---");
        Item base1 = new Chair();
        base1.place();
        base1.use();
        base1.clean();
        base1.move();

        System.out.println("\n--- Chair ---");
        Chair child = new Chair();
        child.place();
        child.use();
        child.clean();
        child.move();
    }
}
