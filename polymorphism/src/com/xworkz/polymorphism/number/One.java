package com.xworkz.polymorphism.number;

public class One extends Number{
        @Override
        public void value() {
            System.out.println("One: The number 1, the first and smallest positive integer.");
        }

        @Override
        public void add() {
            System.out.println("One: Adding one to a number increases the value by 1.");
        }

        @Override
        public void subtract() {
            System.out.println("One: Subtracting one from a number decreases the value by 1.");
        }

        @Override
        public void multiply() {
            System.out.println("One: Multiplying one by any number results in that same number.");
        }

        @Override
        public void divide() {
            System.out.println("One: Dividing one by any number results in a fraction of that number.");
        }
    }


