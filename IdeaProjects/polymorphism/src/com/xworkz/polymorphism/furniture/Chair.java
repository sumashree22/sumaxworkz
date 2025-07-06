package com.xworkz.polymorphism.furniture;



public class Chair extends Item {
    @Override
    public void place() {
        System.out.println("Chair: Overriding place");
    }
    @Override
    public void use() {
        System.out.println("Chair: Overriding use");
    }
    @Override
    public void clean() {
        System.out.println("Chair: Overriding clean");
    }
    @Override
    public void move() {
        System.out.println("Chair: Overriding move");
    }
}
