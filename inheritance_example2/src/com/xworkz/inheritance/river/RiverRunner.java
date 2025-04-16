package com.xworkz.inheritance.river;

public class RiverRunner {
    public static void main(String[] args) {
        River base = new River();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Amazon derived = new Amazon();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        River poly = new Amazon();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}