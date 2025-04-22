package com.xworkz.toString.Recipe;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Recipe {
    private String dishName;
    private String cuisine;
    private int prepTime; // in minutes
    private String[] ingredients;
    private String[] instructions;
    private int servings;

    @Override
    public String toString() {
        return "Recipe Details:\n" +
                "Dish Name = " + this.dishName + "\n" +
                "Cuisine = " + this.cuisine + "\n" +
                "Preparation Time = " + this.prepTime + " minutes\n" +
                "Servings = " + this.servings + "\n" +
                "Ingredients = " + String.join(", ", this.ingredients) + "\n" +
                "Instructions = " + String.join(", ", this.instructions);
    }
}

