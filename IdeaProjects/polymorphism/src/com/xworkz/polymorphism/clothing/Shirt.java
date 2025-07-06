package com.xworkz.polymorphism.clothing;

public class Shirt extends Apparel {
    @Override
    public void wear() {
        System.out.println("Shirt: Overriding wear");
    }
    @Override
    public void wash() {
        System.out.println("Shirt: Overriding wash");
    }
    @Override
    public void fold() {
        System.out.println("Shirt: Overriding fold");
    }
    @Override
    public void dry() {
        System.out.println("Shirt: Overriding dry");
    }
}
