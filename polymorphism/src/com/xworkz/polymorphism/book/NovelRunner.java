package com.xworkz.polymorphism.book;



public class NovelRunner {
    public static void main(String[] args) {
        System.out.println("--- Readable ---");
        Readable base = new Readable();
        base.open();
        base.read();
        base.bookmark();
        base.close();

        System.out.println("\n--- Readable as Novel ---");
        Readable base1 = new Novel();
        base1.open();
        base1.read();
        base1.bookmark();
        base1.close();

        System.out.println("\n--- Novel ---");
        Novel child = new Novel();
        child.open();
        child.read();
        child.bookmark();
        child.close();
    }
}
