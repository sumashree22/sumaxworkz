package com.xworkz.polymorphism.book;

public class Readable {
    public void open() {
        System.out.println("Readable: Executing open");
    }
    public void read() {
        System.out.println("Readable: Executing read");
    }
    public void bookmark() {
        System.out.println("Readable: Executing bookmark");
    }
    public void close() {
        System.out.println("Readable: Executing close");
    }
}
