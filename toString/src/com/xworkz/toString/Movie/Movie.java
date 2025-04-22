package com.xworkz.toString.Movie;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private double boxOfficeRevenue;
    private boolean isAwardWinning;
    private double rating;

    @Override
    public String toString() {
        return "Movie Details:\n" +
                "Title = " + this.title + "\n" +
                "Director = " + this.director + "\n" +
                "Release Year = " + this.releaseYear + "\n" +
                "Genre = " + this.genre + "\n" +
                "Box Office Revenue = ₹" + this.boxOfficeRevenue + " million\n" +
                "Award Winning = " + this.isAwardWinning + "\n" +
                "Rating = " + this.rating + "/10";
    }
}

