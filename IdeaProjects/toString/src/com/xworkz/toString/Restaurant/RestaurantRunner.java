package com.xworkz.toString.Restaurant;

public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.setName("The Blue Moon");
        restaurant.setCuisineType("Continental");
        restaurant.setRating(4);
        restaurant.setOpen(true);
        restaurant.setLocation("New York City, USA");
        restaurant.setSeatingCapacity(120);
        restaurant.setAverageMealCost(1500.50);

        System.out.println(restaurant.toString());
    }
}

