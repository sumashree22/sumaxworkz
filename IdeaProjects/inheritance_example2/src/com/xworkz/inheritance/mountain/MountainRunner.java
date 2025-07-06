package com.xworkz.inheritance.mountain;

public class MountainRunner {
    public static void main(String[] args) {
        Mountain base = new Mountain();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Everest derived = new Everest();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Mountain poly = new Everest();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}