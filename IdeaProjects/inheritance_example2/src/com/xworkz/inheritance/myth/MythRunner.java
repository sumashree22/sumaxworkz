package com.xworkz.task.myth;

public class MythRunner {
    public static void main(String[] args) {
        Myth base = new Myth();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Dragon derived = new Dragon();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Myth poly = new Dragon();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}