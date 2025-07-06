package com.xworkz.polymorphism.course;

public class Mathematics extends Subject {
    @Override
    public void attend() {
        System.out.println("Mathematics: Overriding attend");
    }
    @Override
    public void learn() {
        System.out.println("Mathematics: Overriding learn");
    }
    @Override
    public void revise() {
        System.out.println("Mathematics: Overriding revise");
    }
    @Override
    public void pass() {
        System.out.println("Mathematics: Overriding pass");
    }
}
