package com.xworkz.toString.Pet;


public class PetRunner {
    public static void main(String[] args) {
        Pet pet = new Pet();

        pet.setName("Buddy");
        pet.setSpecies("Dog");
        pet.setAge(3);
        pet.setBreed("Golden Retriever");
        pet.setWeight(30.5);
        pet.setVaccinated(true);
        pet.setFavoriteToy("Tennis Ball");

        System.out.println(pet.toString());
    }
}

