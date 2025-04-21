package com.xworkz.polymorphism.earth;

public class Continent extends Earth {
    @Override
    public void start() {
        System.out.println("Continent: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("Continent: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("Continent: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("Continent: Custom stop");
    }
}
