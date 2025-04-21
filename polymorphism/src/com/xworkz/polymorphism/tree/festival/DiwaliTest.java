package com.xworkz.isarelationship.festival;

import com.xworkz.isarelationship.celebration.Celebration;

public class DiwaliTest {
    public static void main(String[] args) {
        System.out.println("--- Celebration ---");
        Celebration base = new Celebration();
        base.decorate();
        base.gather();
        base.enjoy();
        base.conclude();

        System.out.println("\n--- Celebration as Diwali ---");
        Celebration base1 = new Diwali();
        base1.decorate();
        base1.gather();
        base1.enjoy();
        base1.conclude();

        System.out.println("\n--- Diwali ---");
        Diwali child = new Diwali();
        child.decorate();
        child.gather();
        child.enjoy();
        child.conclude();
    }
}
