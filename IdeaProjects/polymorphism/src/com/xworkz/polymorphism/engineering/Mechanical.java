package com.xworkz.polymorphism.engineering;

public class Mechanical extends Engineering {
    @Override
    public void start() {
        System.out.println("Mechanical: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("Mechanical: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("Mechanical: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("Mechanical: Custom stop");
    }
}
