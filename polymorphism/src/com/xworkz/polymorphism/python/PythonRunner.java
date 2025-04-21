package com.xworkz.polymorphism.python;

public class PythonRunner {
    public static void main(String[] args) {
        System.out.println("--- Python ---");
        Python base = new Python();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Python as PythonScript ---");
        Python base1 = new PythonScript();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- PythonScript ---");
        PythonScript child = new PythonScript();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
