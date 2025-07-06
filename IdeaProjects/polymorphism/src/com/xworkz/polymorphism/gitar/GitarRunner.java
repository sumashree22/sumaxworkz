package com.xworkz.example.gitar;

public class GitarRunner {
    public static void main(String[] args) {
        System.out.println("--- Gitar ---");
        Gitar base = new Gitar();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Gitar as ElectricGuitar ---");
        Gitar base1 = new ElectricGuitar();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- ElectricGuitar ---");
        ElectricGuitar child = new ElectricGuitar();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
