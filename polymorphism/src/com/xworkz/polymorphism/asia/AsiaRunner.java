package com.xworkz.polymorphism.asia;

public class AsiaRunner {
    public static void main(String[] args) {
        System.out.println("--- Asia ---");
        Contenent base = new Contenent();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Asia as India ---");
        Contenent base1 = new Contenent();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- India ---");
        Contenent child = new Contenent();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
