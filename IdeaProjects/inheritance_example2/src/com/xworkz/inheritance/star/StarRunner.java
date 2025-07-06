package com.xworkz.inheritance.star;

public class StarRunner {
    public static void main(String[] args) {
        Star base = new Star();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Sun derived = new Sun();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Star poly = new Sun();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}