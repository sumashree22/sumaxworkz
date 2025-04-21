package com.xworkz.polymorphism.rose;

public class RedRose extends Rose {
    @Override
    public void start() {
        System.out.println("RedRose: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("RedRose: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("RedRose: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("RedRose: Custom stop");
    }
}
