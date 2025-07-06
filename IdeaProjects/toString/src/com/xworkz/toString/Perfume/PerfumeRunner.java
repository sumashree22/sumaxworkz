package com.xworkz.toString.Perfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume = new Perfume();

        perfume.setBrand("Chanel");
        perfume.setFragrance("No. 5");
        perfume.setVolume(100);
        perfume.setPrice(150.00);
        perfume.setGender("Female");
        perfume.setLaunchDate("1921");

        System.out.println(perfume.toString());
    }
}

