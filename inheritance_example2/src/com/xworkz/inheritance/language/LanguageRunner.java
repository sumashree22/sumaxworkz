package com.xworkz.inheritance.language;

public class LanguageRunner {
    public static void main(String[] args) {
        Language base = new Language();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        English derived = new English();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Language poly = new English();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}