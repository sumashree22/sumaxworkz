package com.xworkz.polymorphism.toy;


public class TeddyBear extends Object {
    @Override
    public void hold() {
        System.out.println("TeddyBear: Overriding hold");
    }
    @Override
    public void shake() {
        System.out.println("TeddyBear: Overriding shake");
    }
    @Override
    public void drop() {
        System.out.println("TeddyBear: Overriding drop");
    }
    @Override
    public void store() {
        System.out.println("TeddyBear: Overriding store");
    }
}
