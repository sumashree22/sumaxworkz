package com.xworkz.toString.Animal;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data //under this @getter,@setter,@ToString,@Equals and Hashcose @requiredArgsConstructor
public class Animal {
    private String name;
    private String species;
    private String habitat; // e.g., Forest, Desert, Ocean
    private int age;
    private double weight; // in kilograms
    private boolean isEndangered;

    @Override
    public String toString() {
        return "Animal Details:\n" +
                "Name = " + this.name + "\n" +
                "Species = " + this.species + "\n" +
                "Habitat = " + this.habitat + "\n" +
                "Age = " + this.age + " years\n" +
                "Weight = " + this.weight + " kg\n" +
                "Endangered = " + this.isEndangered;
    }
}

