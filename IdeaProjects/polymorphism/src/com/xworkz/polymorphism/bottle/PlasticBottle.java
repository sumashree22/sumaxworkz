package com.xworkz.polymorphism.bottle;

public class PlasticBottle extends Bottle {
    @Override
    public void start() {
        System.out.println("PlasticBottle: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("PlasticBottle: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("PlasticBottle: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("PlasticBottle: Custom stop");
    }
}
