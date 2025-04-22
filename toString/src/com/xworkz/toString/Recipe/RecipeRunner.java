package com.xworkz.toString.Recipe;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe recipe = new Recipe();

        recipe.setDishName("Pasta Primavera");
        recipe.setCuisine("Italian");
        recipe.setPrepTime(25); // 25 minutes
        recipe.setIngredients(new String[]{"Pasta", "Tomato", "Basil", "Garlic", "Olive Oil"});
        recipe.setInstructions(new String[]{"Cook the pasta", "Prepare the sauce", "Mix together and serve"});
        recipe.setServings(4);

        System.out.println(recipe.toString());
    }
}
