package com.xworkz.toString.Artist;


public class ArtistRunner {
    public static void main(String[] args) {
        Artist artist = new Artist();

        artist.setName("Pablo Picasso");
        artist.setAge(91);
        artist.setStyle("Cubism");
        artist.setYearsActive(80);
        artist.setNotableWorks(new String[]{"Guernica", "Les Demoiselles d'Avignon", "The Weeping Woman"});
        artist.setCountry("Spain");

        System.out.println(artist.toString());
    }
}

