package com.xworkz.polymorphism.Anime;

public class Naruto extends Anime{

        @Override
        public void create() {
            System.out.println("Naruto: Created by Masashi Kishimoto with ninja-themed storytelling.");
        }

        @Override
        public void stream() {
            System.out.println("Naruto: Available on Crunchyroll, Netflix, and other anime platforms.");
        }

        @Override
        public void dub() {
            System.out.println("Naruto: Dubbed in English, Hindi, and other languages.");
        }

        @Override
        public void animate() {
            System.out.println("Naruto: Features high-quality fight scenes and emotional moments.");
        }

        @Override
        public void fanBase() {
            System.out.println("Naruto: Has one of the largest anime fanbases in the world.");
        }
    }


