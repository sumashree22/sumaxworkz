package com.xworkz.polymorphism.filmindustry;

public class BollywoodRunner {

        public static void main(String[] args) {
            System.out.println("--- Film Industry ---");
            FilmIndustry industry = new FilmIndustry();
            industry.produceFilm();
            industry.castActors();
            industry.releaseFilm();
            industry.promoteFilm();
            industry.earnRevenue();

            System.out.println("\n--- Film Industry as Bollywood ---");
            FilmIndustry industry1 = new Bollywood();
            industry1.produceFilm();
            industry1.castActors();
            industry1.releaseFilm();
            industry1.promoteFilm();
            industry1.earnRevenue();

            System.out.println("\n--- Bollywood ---");
            Bollywood bollywood = new Bollywood();
            bollywood.produceFilm();
            bollywood.castActors();
            bollywood.releaseFilm();
            bollywood.promoteFilm();
            bollywood.earnRevenue();
        }
    }


