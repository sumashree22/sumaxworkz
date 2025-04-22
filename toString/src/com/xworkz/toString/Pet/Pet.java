package com.xworkz.toString.Pet;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pet {
    private String name;
    private String species;
    private int age;
    private String breed;
    private double weight; // in kg
    private boolean isVaccinated;
    private String favoriteToy;

    @Override
    public String toString() {
        return "Pet Details:\n" +
                "Name = " + this.name + "\n" +
                "Species = " + this.species + "\n" +
                "Age = " + this.age + " years\n" +
                "Breed = " + this.breed + "\n" +
                "Weight = " + this.weight + " kg\n" +
                "Is Vaccinated = " + this.isVaccinated + "\n" +
                "Favorite Toy = " + this.favoriteToy;
    }
}
