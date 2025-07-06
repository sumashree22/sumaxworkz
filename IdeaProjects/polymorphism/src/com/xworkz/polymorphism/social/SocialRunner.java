package com.xworkz.polymorphism.social;

public class SocialRunner {
    public static void main(String[] args) {
        System.out.println("--- Social ---");
        Social base = new Social();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Social as History ---");
        Social base1 = new History();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- History ---");
        History child = new History();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
