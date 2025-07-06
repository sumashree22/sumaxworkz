package com.xworkz.inheritance.fish;

public class FishRunner {
    public static void main(String[] args) {
        Fish base = new Fish();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Salmon derived = new Salmon();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Fish poly = new Salmon();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}