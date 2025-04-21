package com.xworkz.polymorphism.shoppingplatform;

public class ZeptoRunner {
        public static void main(String[] args) {
            System.out.println("--- Shopping Application ---");
            ShoppingApplication shoppingApp = new ShoppingApplication();
            shoppingApp.browseItems();
            shoppingApp.addToCart();
            shoppingApp.checkout();
            shoppingApp.makePayment();
            shoppingApp.trackOrder();

            System.out.println("--- Shopping Application as Zepto ---");
            ShoppingApplication shoppingApp1 = new Zepto();
            shoppingApp1.browseItems();
            shoppingApp1.addToCart();
            shoppingApp1.checkout();
            shoppingApp1.makePayment();
            shoppingApp1.trackOrder();

            System.out.println("--- Zepto ---");
            Zepto zepto = new Zepto();
            zepto.browseItems();
            zepto.addToCart();
            zepto.checkout();
            zepto.makePayment();
            zepto.trackOrder();
        }
    }


