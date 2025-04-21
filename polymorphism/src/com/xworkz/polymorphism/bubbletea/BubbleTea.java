package com.xworkz.polymorphism.bubbletea;

public class BubbleTea extends RefreshingDrink {

        @Override
        public void prepare() {
            System.out.println("BubbleTea: Preparing tea with tapioca pearls and milk or fruit flavors.");
        }

        @Override
        public void serve() {
            System.out.println("BubbleTea: Serving with a fat straw in a sealed cup.");
        }

        @Override
        public void consume() {
            System.out.println("BubbleTea: Enjoying chewy pearls with every sip.");
        }

        @Override
        public void addIce() {
            System.out.println("BubbleTea: Adding crushed or cubed ice based on preference.");
        }

        @Override
        public void flavor() {
            System.out.println("BubbleTea: Adding popular flavors like taro, matcha, or lychee.");
        }
    }


