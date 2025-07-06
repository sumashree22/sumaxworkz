package com.xworkz.inheritance.movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie base = new Movie();
        base.feature1();
        base.feature2();
        base.feature3();
        base.feature4();
        base.feature5();

        Inception derived = new Inception();
        derived.feature1();
        derived.feature2();
        derived.feature3();
        derived.feature4();
        derived.feature5();

        Movie poly = new Inception();
        poly.feature1();
        poly.feature2();
        poly.feature3();
        poly.feature4();
        poly.feature5();
    }
}