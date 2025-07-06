package com.xworkz.polymorphism.python;

public class PythonScript extends Python {
    @Override
    public void start() {
        System.out.println("PythonScript: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("PythonScript: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("PythonScript: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("PythonScript: Custom stop");
    }
}
