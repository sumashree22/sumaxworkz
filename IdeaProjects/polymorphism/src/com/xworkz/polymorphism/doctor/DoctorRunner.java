package com.xworkz.polymorphism.doctor;

public class DoctorRunner {
    public static void main(String[] args) {
        System.out.println("--- Doctor ---");
        Doctor base = new Doctor();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Doctor as Surgeon ---");
        Doctor base1 = new Surgeon();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- Surgeon ---");
        Surgeon child = new Surgeon();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
