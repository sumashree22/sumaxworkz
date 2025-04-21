package com.xworkz.polymorphism.tomandjerry;

public class TomandjerryRunner {
    public static void main(String[] args) {
        System.out.println("--- Tomandjerry ---");
        Cartoon base = new Cartoon();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Tomandjerry as Tom ---");
        Cartoon base1 = new Tom();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- Tom ---");
        Tom child = new Tom();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
