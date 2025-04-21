package com.xworkz.polymorphism.course;

public class MathematicsRunner {
    public static void main(String[] args) {
        System.out.println("--- Study ---");
        Subject base=new Subject();

        base.attend();
        base.learn();
        base.revise();
        base.pass();

        System.out.println("\n--- Study as Mathematics ---");
      Subject base1=new Mathematics();
        base1.attend();
        base1.learn();
        base1.revise();
        base1.pass();

        System.out.println("\n--- Mathematics ---");
        Mathematics child = new Mathematics();
        child.attend();
        child.learn();
        child.revise();
        child.pass();
    }
}
