package com.xworkz.polymorphism.oxygen;

public class OxygenMolecule extends Oxygen {
    @Override
    public void start() {
        System.out.println("OxygenMolecule: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("OxygenMolecule: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("OxygenMolecule: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("OxygenMolecule: Custom stop");
    }
}
