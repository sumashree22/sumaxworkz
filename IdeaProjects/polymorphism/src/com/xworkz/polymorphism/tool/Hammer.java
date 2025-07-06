package com.xworkz.polymorphism.tool;



public class Hammer extends Utility {
    @Override
    public void grab() {
        System.out.println("Hammer: Overriding grab");
    }
    @Override
    public void hit() {
        System.out.println("Hammer: Overriding hit");
    }
    @Override
    public void fix() {
        System.out.println("Hammer: Overriding fix");
    }
    @Override
    public void store() {
        System.out.println("Hammer: Overriding store");
    }
}
