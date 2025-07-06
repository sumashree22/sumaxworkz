package com.xworkz.polymorphism.chiefminister;

public class ChiefministerRunner {
    public static void main(String[] args) {
        System.out.println("--- Chiefminister ---");
        Chiefminister base = new Chiefminister();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Chiefminister as StateLeader ---");
        Chiefminister base1 = new StateLeader();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- StateLeader ---");
        StateLeader child = new StateLeader();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
