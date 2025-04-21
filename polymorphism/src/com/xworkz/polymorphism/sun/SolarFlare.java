package com.xworkz.polymorphism.sun;

public class SolarFlare extends Sun {
    @Override
    public void start() {
        System.out.println("SolarFlare: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("SolarFlare: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("SolarFlare: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("SolarFlare: Custom stop");
    }
}
