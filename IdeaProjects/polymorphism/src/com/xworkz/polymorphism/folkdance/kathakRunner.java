package com.xworkz.polymorphism.folkdance;

public class kathakRunner {

        public static void main(String[] args) {
            System.out.println("--- Folk Dance ---");
            FolkDance dance = new FolkDance();
            dance.origin();
            dance.perform();
            dance.costume();
            dance.music();
            dance.expression();

            System.out.println("\n--- Folk Dance as Kathak ---");
            FolkDance dance1 = new Kathak();
            dance1.origin();
            dance1.perform();
            dance1.costume();
            dance1.music();
            dance1.expression();

            System.out.println("\n--- Kathak ---");
            Kathak kathak = new Kathak();
            kathak.origin();
            kathak.perform();
            kathak.costume();
            kathak.music();
            kathak.expression();
        }
    }


