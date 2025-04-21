package com.xworkz.polymorphism.tomandjerry;

public class Tom extends Cartoon {
    @Override
    public void start() {
        System.out.println("Tom: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("Tom: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("Tom: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("Tom: Custom stop");
    }
}
