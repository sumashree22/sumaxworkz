package com.xworkz.inheritance.profession;

public class ProfessionRunner {
    public static void main(String[] args) {
        Profession base = new Profession();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Doctor derived = new Doctor();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Profession poly = new Doctor();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}