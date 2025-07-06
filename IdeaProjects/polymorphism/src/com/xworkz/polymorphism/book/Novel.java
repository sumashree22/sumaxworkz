package com.xworkz.polymorphism.book;



public class Novel extends Readable {
    @Override
    public void open() {
        System.out.println("Novel: Overriding open");
    }
    @Override
    public void read() {
        System.out.println("Novel: Overriding read");
    }
    @Override
    public void bookmark() {
        System.out.println("Novel: Overriding bookmark");
    }
    @Override
    public void close() {
        System.out.println("Novel: Overriding close");
    }
}
