package com.xworkz.shirtapp;

import com.xworkz.shirtapp.shirt.Shirt;

public class ShirtRunner {

        public static void main(String[] args) {

            Shirt shirt1 = new Shirt();
            shirt1.setShirtId(1);
            shirt1.setBrand("Peter England");
            shirt1.setSize("M");
            shirt1.setPrice(1299.99);
            shirt1.setColor("Blue");
            shirt1.setMaterial("Cotton");
            shirt1.setSleeveType("Full Sleeve");

            int ref = shirt1.getShirtId();
            System.out.println("Shirt ID: " + ref);
            String ref1 = shirt1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = shirt1.getSize();
            System.out.println("Size: " + ref2);
            double ref3 = shirt1.getPrice();
            System.out.println("Price: " + ref3);
            String ref4 = shirt1.getColor();
            System.out.println("Color: " + ref4);
            String ref5 = shirt1.getMaterial();
            System.out.println("Material: " + ref5);
            String ref6 = shirt1.getSleeveType();
            System.out.println("Sleeve Type: " + ref6);
            System.out.println();

            Shirt shirt2 = new Shirt();
            shirt2.setShirtId(2);
            shirt2.setBrand("Louis Philippe");
            shirt2.setSize("L");
            shirt2.setPrice(1899.50);
            shirt2.setColor("White");
            shirt2.setMaterial("Linen");
            shirt2.setSleeveType("Half Sleeve");

            int ref7 = shirt2.getShirtId();
            System.out.println("Shirt ID: " + ref7);
            String ref8 = shirt2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = shirt2.getSize();
            System.out.println("Size: " + ref9);
            double ref10 = shirt2.getPrice();
            System.out.println("Price: " + ref10);
            String ref11 = shirt2.getColor();
            System.out.println("Color: " + ref11);
            String ref12 = shirt2.getMaterial();
            System.out.println("Material: " + ref12);
            String ref13 = shirt2.getSleeveType();
            System.out.println("Sleeve Type: " + ref13);
            System.out.println();

            Shirt shirt3 = new Shirt();
            shirt3.setShirtId(3);
            shirt3.setBrand("Arrow");
            shirt3.setSize("XL");
            shirt3.setPrice(1599.0);
            shirt3.setColor("Black");
            shirt3.setMaterial("Silk");
            shirt3.setSleeveType("Full Sleeve");

            int ref14 = shirt3.getShirtId();
            System.out.println("Shirt ID: " + ref14);
            String ref15 = shirt3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = shirt3.getSize();
            System.out.println("Size: " + ref16);
            double ref17 = shirt3.getPrice();
            System.out.println("Price: " + ref17);
            String ref18 = shirt3.getColor();
            System.out.println("Color: " + ref18);
            String ref19 = shirt3.getMaterial();
            System.out.println("Material: " + ref19);
            String ref20 = shirt3.getSleeveType();
            System.out.println("Sleeve Type: " + ref20);
            System.out.println();

            Shirt shirt4 = new Shirt();
            shirt4.setShirtId(4);
            shirt4.setBrand("Van Heusen");
            shirt4.setSize("S");
            shirt4.setPrice(999.0);
            shirt4.setColor("Gray");
            shirt4.setMaterial("Polyester");
            shirt4.setSleeveType("Half Sleeve");

            int ref21 = shirt4.getShirtId();
            System.out.println("Shirt ID: " + ref21);
            String ref22 = shirt4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = shirt4.getSize();
            System.out.println("Size: " + ref23);
            double ref24 = shirt4.getPrice();
            System.out.println("Price: " + ref24);
            String ref25 = shirt4.getColor();
            System.out.println("Color: " + ref25);
            String ref26 = shirt4.getMaterial();
            System.out.println("Material: " + ref26);
            String ref27 = shirt4.getSleeveType();
            System.out.println("Sleeve Type: " + ref27);
            System.out.println();

            Shirt shirt5 = new Shirt();
            shirt5.setShirtId(5);
            shirt5.setBrand("Zara");
            shirt5.setSize("M");
            shirt5.setPrice(2499.75);
            shirt5.setColor("Olive");
            shirt5.setMaterial("Denim");
            shirt5.setSleeveType("Full Sleeve");

            int ref28 = shirt5.getShirtId();
            System.out.println("Shirt ID: " + ref28);
            String ref29 = shirt5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = shirt5.getSize();
            System.out.println("Size: " + ref30);
            double ref31 = shirt5.getPrice();
            System.out.println("Price: " + ref31);
            String ref32 = shirt5.getColor();
            System.out.println("Color: " + ref32);
            String ref33 = shirt5.getMaterial();
            System.out.println("Material: " + ref33);
            String ref34 = shirt5.getSleeveType();
            System.out.println("Sleeve Type: " + ref34);
            System.out.println();
        }
}
