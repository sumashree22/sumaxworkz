package com.xworkz.isarelationship.tree;

import com.xworkz.isarelationship.plantation.Plantation;

public class MangoTreeRunner {
    public static void main(String[] args) {
        System.out.println("--- Plantation ---");
        Plantation base = new Plantation();
        base.grow();
        base.water();
        base.shade();
        base.fruit();

        System.out.println("\n--- Plantation as MangoTree ---");
        Plantation base1 = new MangoTree();
        base1.grow();
        base1.water();
        base1.shade();
        base1.fruit();

        System.out.println("\n--- MangoTree ---");
        MangoTree child = new MangoTree();
        child.grow();
        child.water();
        child.shade();
        child.fruit();
    }
}
