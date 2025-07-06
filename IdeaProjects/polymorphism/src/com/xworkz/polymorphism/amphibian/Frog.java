package com.xworkz.polymorphism.amphibian;

public class Frog extends Amphibian{

        @Override
        public void breathe() {
            System.out.println("Frog: Breathing through skin and small lungs");
        }

        @Override
        public void move() {
            System.out.println("Frog: Hopping and swimming");
        }

        @Override
        public void reproduce() {
            System.out.println("Frog: Laying jelly-like eggs in water");
        }

        @Override
        public void habitat() {
            System.out.println("Frog: Found near ponds and wetlands");
        }
    }


