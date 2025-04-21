package com.xworkz.polymorphism.filmindustry;

public class Bollywood  extends FilmIndustry{

        @Override
        public void produceFilm() {
            System.out.println("Bollywood: Producing Hindi language films with cultural themes.");
        }

        @Override
        public void castActors() {
            System.out.println("Bollywood: Casting popular Indian actors and celebrities.");
        }

        @Override
        public void releaseFilm() {
            System.out.println("Bollywood: Releasing films in India and globally on Fridays.");
        }

        @Override
        public void promoteFilm() {
            System.out.println("Bollywood: Promoting through TV shows, music launches, and social media.");
        }

        @Override
        public void earnRevenue() {
            System.out.println("Bollywood: Earning from domestic box office, overseas, and music rights.");
        }
    }


