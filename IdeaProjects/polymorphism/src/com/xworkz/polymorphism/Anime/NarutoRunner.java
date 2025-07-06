package com.xworkz.polymorphism.Anime;

public class NarutoRunner {

        public static void main(String[] args) {
            System.out.println("--- Anime ---");
            Anime anime = new Anime();
            anime.create();
            anime.stream();
            anime.dub();
            anime.animate();
            anime.fanBase();

            System.out.println("\n--- Anime as Naruto ---");
            Anime anime1 = new Naruto();
            anime1.create();
            anime1.stream();
            anime1.dub();
            anime1.animate();
            anime1.fanBase();

            System.out.println("\n--- Naruto ---");
            Naruto naruto = new Naruto();
            naruto.create();
            naruto.stream();
            naruto.dub();
            naruto.animate();
            naruto.fanBase();
        }
    }


