package com.xworkz.polymorphism.metal;

public class Gold  extends Metal{
        @Override
        public void conductHeat() {
            System.out.println("Gold: Excellent heat conductor, used in electronics.");
        }

        @Override
        public void conductElectricity() {
            System.out.println("Gold: Highly efficient in conducting electricity, doesn't tarnish.");
        }

        @Override
        public void melt() {
            System.out.println("Gold: Melts at around 1064°C, used in making jewelry.");
        }

        @Override
        public void shine() {
            System.out.println("Gold: Shines with a bright yellow luster.");
        }

        @Override
        public void beMolded() {
            System.out.println("Gold: Easily molded into intricate designs.");
        }
    }


