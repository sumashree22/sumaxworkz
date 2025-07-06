package com.xworkz.inheritance.university;

public class UniversityRunner {
    public static void main(String[] args) {
        University base = new University();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Harvard derived = new Harvard();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        University poly = new Harvard();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}