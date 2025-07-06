package com.xworkz.polymorphism.Engineer;

public class CivilEngineerRunner {
            public static void main(String[] args) {
            System.out.println("--- Engineer ---");
            Engineer engineer = new Engineer();
            engineer.design();
            engineer.develop();
            engineer.analyze();
            engineer.test();
            engineer.manage();

            System.out.println("\n--- Engineer as Civil Engineer ---");
            Engineer engineer1 = new CivilEngineer();
            engineer1.design();
            engineer1.develop();
            engineer1.analyze();
            engineer1.test();
            engineer1.manage();

            System.out.println("\n--- Civil Engineer ---");
            CivilEngineer civilEngineer = new CivilEngineer();
            civilEngineer.design();
            civilEngineer.develop();
            civilEngineer.analyze();
            civilEngineer.test();
            civilEngineer.manage();
        }
    }


