package com.xworkz.graniteapp;

import com.xworkz.graniteapp.granite.Granite;

public class GraniteRunner {

        public static void main(String[] args) {

            Granite granite1 = new Granite();
            granite1.setGraniteId(1);
            granite1.setType("Polished");
            granite1.setOrigin("India");
            granite1.setPrice(120.5);
            granite1.setColor("Black Galaxy");
            granite1.setFinish("Glossy");
            granite1.setDimensions("600x600 mm");

            int ref = granite1.getGraniteId();
            System.out.println("Granite ID: " + ref);
            String ref1 = granite1.getType();
            System.out.println("Type: " + ref1);
            String ref2 = granite1.getOrigin();
            System.out.println("Origin: " + ref2);
            double ref3 = granite1.getPrice();
            System.out.println("Price: " + ref3);
            String ref4 = granite1.getColor();
            System.out.println("Color: " + ref4);
            String ref5 = granite1.getFinish();
            System.out.println("Finish: " + ref5);
            String ref6 = granite1.getDimensions();
            System.out.println("Dimensions: " + ref6);
            System.out.println();

            Granite granite2 = new Granite();
            granite2.setGraniteId(2);
            granite2.setType("Honed");
            granite2.setOrigin("Brazil");
            granite2.setPrice(150.0);
            granite2.setColor("White Ice");
            granite2.setFinish("Matte");
            granite2.setDimensions("800x800 mm");

            int ref7 = granite2.getGraniteId();
            System.out.println("Granite ID: " + ref7);
            String ref8 = granite2.getType();
            System.out.println("Type: " + ref8);
            String ref9 = granite2.getOrigin();
            System.out.println("Origin: " + ref9);
            double ref10 = granite2.getPrice();
            System.out.println("Price: " + ref10);
            String ref11 = granite2.getColor();
            System.out.println("Color: " + ref11);
            String ref12 = granite2.getFinish();
            System.out.println("Finish: " + ref12);
            String ref13 = granite2.getDimensions();
            System.out.println("Dimensions: " + ref13);
            System.out.println();

            Granite granite3 = new Granite();
            granite3.setGraniteId(3);
            granite3.setType("Flamed");
            granite3.setOrigin("Italy");
            granite3.setPrice(135.75);
            granite3.setColor("Blue Pearl");
            granite3.setFinish("Textured");
            granite3.setDimensions("1000x1000 mm");

            int ref14 = granite3.getGraniteId();
            System.out.println("Granite ID: " + ref14);
            String ref15 = granite3.getType();
            System.out.println("Type: " + ref15);
            String ref16 = granite3.getOrigin();
            System.out.println("Origin: " + ref16);
            double ref17 = granite3.getPrice();
            System.out.println("Price: " + ref17);
            String ref18 = granite3.getColor();
            System.out.println("Color: " + ref18);
            String ref19 = granite3.getFinish();
            System.out.println("Finish: " + ref19);
            String ref20 = granite3.getDimensions();
            System.out.println("Dimensions: " + ref20);
            System.out.println();

            Granite granite4 = new Granite();
            granite4.setGraniteId(4);
            granite4.setType("Leathered");
            granite4.setOrigin("Norway");
            granite4.setPrice(140.0);
            granite4.setColor("Emerald Pearl");
            granite4.setFinish("Satin");
            granite4.setDimensions("900x600 mm");

            int ref21 = granite4.getGraniteId();
            System.out.println("Granite ID: " + ref21);
            String ref22 = granite4.getType();
            System.out.println("Type: " + ref22);
            String ref23 = granite4.getOrigin();
            System.out.println("Origin: " + ref23);
            double ref24 = granite4.getPrice();
            System.out.println("Price: " + ref24);
            String ref25 = granite4.getColor();
            System.out.println("Color: " + ref25);
            String ref26 = granite4.getFinish();
            System.out.println("Finish: " + ref26);
            String ref27 = granite4.getDimensions();
            System.out.println("Dimensions: " + ref27);
            System.out.println();

            Granite granite5 = new Granite();
            granite5.setGraniteId(5);
            granite5.setType("Bush Hammered");
            granite5.setOrigin("South Africa");
            granite5.setPrice(125.25);
            granite5.setColor("Tan Brown");
            granite5.setFinish("Rough");
            granite5.setDimensions("1200x600 mm");

            int ref28 = granite5.getGraniteId();
            System.out.println("Granite ID: " + ref28);
            String ref29 = granite5.getType();
            System.out.println("Type: " + ref29);
            String ref30 = granite5.getOrigin();
            System.out.println("Origin: " + ref30);
            double ref31 = granite5.getPrice();
            System.out.println("Price: " + ref31);
            String ref32 = granite5.getColor();
            System.out.println("Color: " + ref32);
            String ref33 = granite5.getFinish();
            System.out.println("Finish: " + ref33);
            String ref34 = granite5.getDimensions();
            System.out.println("Dimensions: " + ref34);
            System.out.println();
        }
}
