package com.xworkz.inheritance.insect;

public class InsectRunner {
    public static void main(String[] args) {
        Insect base = new Insect();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Butterfly derived = new Butterfly();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Insect poly = new Butterfly();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}