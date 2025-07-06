package com.xworkz.polymorphism.bubbletea;

public class BubbleTeaRunner {

        public static void main(String[] args) {
            System.out.println("--- Refreshing Drink ---");
            RefreshingDrink drink = new RefreshingDrink();
            drink.prepare();
            drink.serve();
            drink.consume();
            drink.addIce();
            drink.flavor();

            System.out.println("\n--- Refreshing Drink as Bubble Tea ---");
            RefreshingDrink drink1 = new BubbleTea();
            drink1.prepare();
            drink1.serve();
            drink1.consume();
            drink1.addIce();
            drink1.flavor();

            System.out.println("\n--- Bubble Tea ---");
            BubbleTea bubbleTea = new BubbleTea();
            bubbleTea.prepare();
            bubbleTea.serve();
            bubbleTea.consume();
            bubbleTea.addIce();
            bubbleTea.flavor();
        }
    }


