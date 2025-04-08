package com.xworkz.majigeapp;

import com.xworkz.majigeapp.drink.Majige;

public class MajigeRunner {

        public static void main(String[] args) {

            Majige majige1 = new Majige();
            majige1.setId(1);
            majige1.setBrand("Nandini");
            majige1.setFlavor("Salted");
            majige1.setPrice(10.0);
            majige1.setQuantity("200ml");
            majige1.setPackagingType("Plastic Pouch");
            majige1.setExpiryDate("2025-01-15");

            int ref = majige1.getId();
            System.out.println("ID: " + ref);
            String ref1 = majige1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = majige1.getFlavor();
            System.out.println("Flavor: " + ref2);
            double ref3 = majige1.getPrice();
            System.out.println("Price: " + ref3);
            String ref4 = majige1.getQuantity();
            System.out.println("Quantity: " + ref4);
            String ref5 = majige1.getPackagingType();
            System.out.println("Packaging Type: " + ref5);
            String ref6 = majige1.getExpiryDate();
            System.out.println("Expiry Date: " + ref6);
            System.out.println();

            Majige majige2 = new Majige();
            majige2.setId(2);
            majige2.setBrand("Amul");
            majige2.setFlavor("Plain");
            majige2.setPrice(12.0);
            majige2.setQuantity("250ml");
            majige2.setPackagingType("Bottle");
            majige2.setExpiryDate("2025-02-10");

            int ref7 = majige2.getId();
            System.out.println("ID: " + ref7);
            String ref8 = majige2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = majige2.getFlavor();
            System.out.println("Flavor: " + ref9);
            double ref10 = majige2.getPrice();
            System.out.println("Price: " + ref10);
            String ref11 = majige2.getQuantity();
            System.out.println("Quantity: " + ref11);
            String ref12 = majige2.getPackagingType();
            System.out.println("Packaging Type: " + ref12);
            String ref13 = majige2.getExpiryDate();
            System.out.println("Expiry Date: " + ref13);
            System.out.println();

            Majige majige3 = new Majige();
            majige3.setId(3);
            majige3.setBrand("Arokya");
            majige3.setFlavor("Spiced");
            majige3.setPrice(15.0);
            majige3.setQuantity("300ml");
            majige3.setPackagingType("Tetra Pack");
            majige3.setExpiryDate("2025-03-05");

            int ref14 = majige3.getId();
            System.out.println("ID: " + ref14);
            String ref15 = majige3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = majige3.getFlavor();
            System.out.println("Flavor: " + ref16);
            double ref17 = majige3.getPrice();
            System.out.println("Price: " + ref17);
            String ref18 = majige3.getQuantity();
            System.out.println("Quantity: " + ref18);
            String ref19 = majige3.getPackagingType();
            System.out.println("Packaging Type: " + ref19);
            String ref20 = majige3.getExpiryDate();
            System.out.println("Expiry Date: " + ref20);
            System.out.println();

            Majige majige4 = new Majige();
            majige4.setId(4);
            majige4.setBrand("Heritage");
            majige4.setFlavor("Mint");
            majige4.setPrice(18.0);
            majige4.setQuantity("350ml");
            majige4.setPackagingType("Glass Bottle");
            majige4.setExpiryDate("2025-03-20");

            int ref21 = majige4.getId();
            System.out.println("ID: " + ref21);
            String ref22 = majige4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = majige4.getFlavor();
            System.out.println("Flavor: " + ref23);
            double ref24 = majige4.getPrice();
            System.out.println("Price: " + ref24);
            String ref25 = majige4.getQuantity();
            System.out.println("Quantity: " + ref25);
            String ref26 = majige4.getPackagingType();
            System.out.println("Packaging Type: " + ref26);
            String ref27 = majige4.getExpiryDate();
            System.out.println("Expiry Date: " + ref27);
            System.out.println();

            Majige majige5 = new Majige();
            majige5.setId(5);
            majige5.setBrand("KMF");
            majige5.setFlavor("Cumin");
            majige5.setPrice(11.0);
            majige5.setQuantity("220ml");
            majige5.setPackagingType("Plastic Cup");
            majige5.setExpiryDate("2025-04-01");

            int ref28 = majige5.getId();
            System.out.println("ID: " + ref28);
            String ref29 = majige5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = majige5.getFlavor();
            System.out.println("Flavor: " + ref30);
            double ref31 = majige5.getPrice();
            System.out.println("Price: " + ref31);
            String ref32 = majige5.getQuantity();
            System.out.println("Quantity: " + ref32);
            String ref33 = majige5.getPackagingType();
            System.out.println("Packaging Type: " + ref33);
            String ref34 = majige5.getExpiryDate();
            System.out.println("Expiry Date: " + ref34);
            System.out.println();
        }
}
