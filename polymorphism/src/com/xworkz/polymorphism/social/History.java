package com.xworkz.polymorphism.social;

public class History extends Social {
    @Override
    public void start() {
        System.out.println("History: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("History: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("History: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("History: Custom stop");
    }
}
