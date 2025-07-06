package com.xworkz.polymorphism.asia;


    public class Asia extends Contenent {
        @Override
        public void start() {
            System.out.println("India: Custom start");
        }

        @Override
        public void configure() {
            System.out.println("India: Custom configuration");
        }

        @Override
        public void execute() {
            System.out.println("India: Custom execution");
        }

        @Override
        public void stop() {
            System.out.println("India: Custom stop");
        }
    }


