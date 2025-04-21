package com.xworkz.polymorphism.doctor;

public class Surgeon extends Doctor {
    @Override
    public void start() {
        System.out.println("Surgeon: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("Surgeon: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("Surgeon: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("Surgeon: Custom stop");
    }
}
