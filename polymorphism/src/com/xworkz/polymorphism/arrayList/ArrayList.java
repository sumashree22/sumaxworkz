package com.xworkz.polymorphism.arrayList;

public class ArrayList extends  List{
       @Override
        public void add() {
            System.out.println("ArrayList: Efficiently adding an item");
        }

        @Override
        public void remove() {
            System.out.println("ArrayList: Removing item using index");
        }

        @Override
        public void display() {
            System.out.println("ArrayList: Displaying in insertion order");
        }

        @Override
        public void size() {
            System.out.println("ArrayList: Getting current size");
        }
    }


