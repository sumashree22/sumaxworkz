package com.xworkz.polymorphism.supermarket;

public class SuvidhaRunner {

        public static void main(String[] args) {
            System.out.println("--- Supermarket ---");
            Supermarket supermarket = new Supermarket();
            supermarket.openStore();
            supermarket.sellItems();
            supermarket.provideOffers();
            supermarket.manageInventory();
            supermarket.generateBill();

            System.out.println("\n--- Supermarket as Suvidha ---");
            Supermarket supermarket1 = new Suvidha();
            supermarket1.openStore();
            supermarket1.sellItems();
            supermarket1.provideOffers();
            supermarket1.manageInventory();
            supermarket1.generateBill();

            System.out.println("\n--- Suvidha ---");
            Suvidha suvidha = new Suvidha();
            suvidha.openStore();
            suvidha.sellItems();
            suvidha.provideOffers();
            suvidha.manageInventory();
            suvidha.generateBill();
        }
    }


