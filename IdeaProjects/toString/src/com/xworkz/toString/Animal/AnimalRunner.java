package com.xworkz.toString.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setName("Bengal Tiger");
        animal.setSpecies("Panthera tigris tigris");
        animal.setHabitat("Tropical Forests of India");
        animal.setAge(8);
        animal.setWeight(220.5);
        animal.setEndangered(true);

        System.out.println(animal.toString());
    }
}

