package com.xworkz.polymorphism.supermarket;

public class Suvidha extends Supermarket{

        @Override
        public void openStore() {
            System.out.println("Suvidha: Opening Suvidha supermarket for daily essentials.");
        }

        @Override
        public void sellItems() {
            System.out.println("Suvidha: Selling fresh produce, packaged foods, and local products.");
        }

        @Override
        public void provideOffers() {
            System.out.println("Suvidha: Providing loyalty points and weekly deals.");
        }

        @Override
        public void manageInventory() {
            System.out.println("Suvidha: Using smart inventory system to track product availability.");
        }

        @Override
        public void generateBill() {
            System.out.println("Suvidha: Generating digital and printed bills at counters.");
        }
    }


