package com.xworkz.mattressapp;

import com.xworkz.mattressapp.furniture.Mattress;

public class MattressRunner {

        public static void main(String[] args) {

            Mattress mattress1 = new Mattress();
            mattress1.setMattressId(1);
            mattress1.setBrand("Sleepwell");
            mattress1.setSize("Queen");
            mattress1.setMaterial("Memory Foam");
            mattress1.setThickness(6.0);
            mattress1.setPrice(12000.0);
            mattress1.setColor("White");

            int ref = mattress1.getMattressId();
            System.out.println("Mattress ID: " + ref);
            String ref1 = mattress1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = mattress1.getSize();
            System.out.println("Size: " + ref2);
            String ref3 = mattress1.getMaterial();
            System.out.println("Material: " + ref3);
            double ref4 = mattress1.getThickness();
            System.out.println("Thickness: " + ref4);
            double ref5 = mattress1.getPrice();
            System.out.println("Price: " + ref5);
            String ref6 = mattress1.getColor();
            System.out.println("Color: " + ref6);
            System.out.println();

            Mattress mattress2 = new Mattress();
            mattress2.setMattressId(2);
            mattress2.setBrand("Kurlon");
            mattress2.setSize("King");
            mattress2.setMaterial("Coir");
            mattress2.setThickness(8.0);
            mattress2.setPrice(18000.0);
            mattress2.setColor("Beige");

            int ref7 = mattress2.getMattressId();
            System.out.println("Mattress ID: " + ref7);
            String ref8 = mattress2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = mattress2.getSize();
            System.out.println("Size: " + ref9);
            String ref10 = mattress2.getMaterial();
            System.out.println("Material: " + ref10);
            double ref11 = mattress2.getThickness();
            System.out.println("Thickness: " + ref11);
            double ref12 = mattress2.getPrice();
            System.out.println("Price: " + ref12);
            String ref13 = mattress2.getColor();
            System.out.println("Color: " + ref13);
            System.out.println();

            Mattress mattress3 = new Mattress();
            mattress3.setMattressId(3);
            mattress3.setBrand("Wakefit");
            mattress3.setSize("Single");
            mattress3.setMaterial("Latex");
            mattress3.setThickness(5.0);
            mattress3.setPrice(9000.0);
            mattress3.setColor("Grey");

            int ref14 = mattress3.getMattressId();
            System.out.println("Mattress ID: " + ref14);
            String ref15 = mattress3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = mattress3.getSize();
            System.out.println("Size: " + ref16);
            String ref17 = mattress3.getMaterial();
            System.out.println("Material: " + ref17);
            double ref18 = mattress3.getThickness();
            System.out.println("Thickness: " + ref18);
            double ref19 = mattress3.getPrice();
            System.out.println("Price: " + ref19);
            String ref20 = mattress3.getColor();
            System.out.println("Color: " + ref20);
            System.out.println();

            Mattress mattress4 = new Mattress();
            mattress4.setMattressId(4);
            mattress4.setBrand("Peps");
            mattress4.setSize("Double");
            mattress4.setMaterial("Spring");
            mattress4.setThickness(7.5);
            mattress4.setPrice(15000.0);
            mattress4.setColor("Blue");

            int ref21 = mattress4.getMattressId();
            System.out.println("Mattress ID: " + ref21);
            String ref22 = mattress4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = mattress4.getSize();
            System.out.println("Size: " + ref23);
            String ref24 = mattress4.getMaterial();
            System.out.println("Material: " + ref24);
            double ref25 = mattress4.getThickness();
            System.out.println("Thickness: " + ref25);
            double ref26 = mattress4.getPrice();
            System.out.println("Price: " + ref26);
            String ref27 = mattress4.getColor();
            System.out.println("Color: " + ref27);
            System.out.println();

            Mattress mattress5 = new Mattress();
            mattress5.setMattressId(5);
            mattress5.setBrand("Duroflex");
            mattress5.setSize("Queen");
            mattress5.setMaterial("Gel Foam");
            mattress5.setThickness(6.5);
            mattress5.setPrice(16000.0);
            mattress5.setColor("Ivory");

            int ref28 = mattress5.getMattressId();
            System.out.println("Mattress ID: " + ref28);
            String ref29 = mattress5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = mattress5.getSize();
            System.out.println("Size: " + ref30);
            String ref31 = mattress5.getMaterial();
            System.out.println("Material: " + ref31);
            double ref32 = mattress5.getThickness();
            System.out.println("Thickness: " + ref32);
            double ref33 = mattress5.getPrice();
            System.out.println("Price: " + ref33);
            String ref34 = mattress5.getColor();
            System.out.println("Color: " + ref34);
            System.out.println();
        }

}
