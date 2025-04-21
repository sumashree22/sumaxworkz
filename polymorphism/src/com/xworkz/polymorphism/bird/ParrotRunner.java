package com.xworkz.polymorphism.bird;

public class ParrotRunner {
    public static void main(String[] args) {
        System.out.println("--- Animal ---");
        Bird base=new Bird() ;
        base.eat();
        base.sleep();
        base.fly();
        base.chirp();

        System.out.println("\n--- Animal as Parrot ---");
      Bird base1=new Parrot();
        base1.eat();
        base1.sleep();
        base1.fly();
        base1.chirp();

        System.out.println("\n--- Parrot ---");
        Parrot child = new Parrot();
        child.eat();
        child.sleep();
        child.fly();
        child.chirp();
    }
}
