package com.xworkz.example.gitar;

public class ElectricGuitar extends Gitar {
    @Override
    public void start() {
        System.out.println("ElectricGuitar: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("ElectricGuitar: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("ElectricGuitar: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("ElectricGuitar: Custom stop");
    }
}
