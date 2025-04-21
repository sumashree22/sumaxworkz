package com.xworkz.polymorphism.number;

public class OneRunner {
        public static void main(String[] args) {
            System.out.println("--- Number ---");
            Number number = new Number();
            number.value();
            number.add();
            number.subtract();
            number.multiply();
            number.divide();

            System.out.println("\n--- Number as One ---");
            Number number1 = new One();
            number1.value();
            number1.add();
            number1.subtract();
            number1.multiply();
            number1.divide();

            System.out.println("\n--- One ---");
            One one = new One();
            one.value();
            one.add();
            one.subtract();
            one.multiply();
            one.divide();
        }
    }


