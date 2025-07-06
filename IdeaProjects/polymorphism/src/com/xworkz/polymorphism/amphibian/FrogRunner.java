package com.xworkz.polymorphism.amphibian;

public class FrogRunner {

        public static void main(String[] args) {
            System.out.println("Amphibian" );
            Amphibian amphibian = new Amphibian();
            amphibian.breathe();
            amphibian.move();
            amphibian.reproduce();
            amphibian.habitat();
            amphibian.survive();

            System.out.println("Amphibian as Frog");
            Amphibian amphibian1 = new Frog();
            amphibian1.breathe();
            amphibian1.move();
            amphibian1.reproduce();
            amphibian1.habitat();
            amphibian1.survive();

            System.out.println("Frog ");
            Frog frog = new Frog();
            frog.breathe();
            frog.move();
            frog.reproduce();
            frog.habitat();
            frog.survive();
        }
    }


