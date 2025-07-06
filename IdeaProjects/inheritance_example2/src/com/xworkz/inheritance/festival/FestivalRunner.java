package com.xworkz.inheritance.festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival base = new Festival();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Diwali derived = new Diwali();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Festival poly = new Diwali();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}