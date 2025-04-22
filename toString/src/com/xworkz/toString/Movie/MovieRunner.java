package com.xworkz.toString.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setTitle("Inception");
        movie.setDirector("Christopher Nolan");
        movie.setReleaseYear(2010);
        movie.setGenre("Sci-Fi");
        movie.setBoxOfficeRevenue(829.9); // in million USD
        movie.setAwardWinning(true);
        movie.setRating(8.8);

        System.out.println(movie.toString());
    }
}

