package com.xworkz.polymorphism.shoppingplatform;

public class Zepto extends  ShoppingApplication{
        @Override
        public void browseItems() {
            System.out.println("Zepto: Browsing groceries and household items available for fast delivery.");
        }

        @Override
        public void addToCart() {
            System.out.println("Zepto: Adding grocery items like fruits, vegetables, and daily essentials to the cart.");
        }

        @Override
        public void checkout() {
            System.out.println("Zepto: Checking out with a fast delivery option.");
        }

        @Override
        public void makePayment() {
            System.out.println("Zepto: Making payment through various online methods");
        }

        @Override
        public void trackOrder() {
            System.out.println("Zepto: Tracking your grocery delivery status in real-time.");
        }
    }


