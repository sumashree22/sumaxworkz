package com.xworkz.polymorphism.sport;

public class HokeyRunner {

        public static void main(String[] args) {
            System.out.println("--- Sport ---");
            Sport sport = new Sport();
            sport.play();
            sport.train();
            sport.compete();
            sport.score();
            sport.rules();

            System.out.println("\n--- Sport as Hockey ---");
            Sport sport1 = new Hockey();
            sport1.play();
            sport1.train();
            sport1.compete();
            sport1.score();
            sport1.rules();

            System.out.println("\n--- Hockey ---");
            Hockey hockey = new Hockey();
            hockey.play();
            hockey.train();
            hockey.compete();
            hockey.score();
            hockey.rules();
        }
    }


