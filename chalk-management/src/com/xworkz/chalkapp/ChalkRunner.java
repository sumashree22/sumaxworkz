package com.xworkz.chalkapp;

import com.xworkz.chalkapp.stationery.Chalk;

public class ChalkRunner {

        public static void main(String[] args) {

            Chalk chalk1 = new Chalk();
            chalk1.setChalkId(1);
            chalk1.setBrand("Camlin");
            chalk1.setColor("White");
            chalk1.setShape("Cylindrical");
            chalk1.setLength(7.5);
            chalk1.setDustFree(true);
            chalk1.setMaterial("Calcium Carbonate");

            int ref = chalk1.getChalkId();
            System.out.println("Chalk ID: " + ref);
            String ref1 = chalk1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = chalk1.getColor();
            System.out.println("Color: " + ref2);
            String ref3 = chalk1.getShape();
            System.out.println("Shape: " + ref3);
            double ref4 = chalk1.getLength();
            System.out.println("Length: " + ref4);
            boolean ref5 = chalk1.isDustFree();
            System.out.println("Dust Free: " + ref5);
            String ref6 = chalk1.getMaterial();
            System.out.println("Material: " + ref6);
            System.out.println();

            Chalk chalk2 = new Chalk();
            chalk2.setChalkId(2);
            chalk2.setBrand("Apsara");
            chalk2.setColor("Yellow");
            chalk2.setShape("Round");
            chalk2.setLength(8.0);
            chalk2.setDustFree(false);
            chalk2.setMaterial("Gypsum");

            int ref7 = chalk2.getChalkId();
            System.out.println("Chalk ID: " + ref7);
            String ref8 = chalk2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = chalk2.getColor();
            System.out.println("Color: " + ref9);
            String ref10 = chalk2.getShape();
            System.out.println("Shape: " + ref10);
            double ref11 = chalk2.getLength();
            System.out.println("Length: " + ref11);
            boolean ref12 = chalk2.isDustFree();
            System.out.println("Dust Free: " + ref12);
            String ref13 = chalk2.getMaterial();
            System.out.println("Material: " + ref13);
            System.out.println();

            Chalk chalk3 = new Chalk();
            chalk3.setChalkId(3);
            chalk3.setBrand("Faber-Castell");
            chalk3.setColor("Green");
            chalk3.setShape("Rectangular");
            chalk3.setLength(7.0);
            chalk3.setDustFree(true);
            chalk3.setMaterial("Calcium Sulfate");

            int ref14 = chalk3.getChalkId();
            System.out.println("Chalk ID: " + ref14);
            String ref15 = chalk3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = chalk3.getColor();
            System.out.println("Color: " + ref16);
            String ref17 = chalk3.getShape();
            System.out.println("Shape: " + ref17);
            double ref18 = chalk3.getLength();
            System.out.println("Length: " + ref18);
            boolean ref19 = chalk3.isDustFree();
            System.out.println("Dust Free: " + ref19);
            String ref20 = chalk3.getMaterial();
            System.out.println("Material: " + ref20);
            System.out.println();

            Chalk chalk4 = new Chalk();
            chalk4.setChalkId(4);
            chalk4.setBrand("Classmate");
            chalk4.setColor("Pink");
            chalk4.setShape("Cylindrical");
            chalk4.setLength(6.8);
            chalk4.setDustFree(true);
            chalk4.setMaterial("Calcium Carbonate");

            int ref21 = chalk4.getChalkId();
            System.out.println("Chalk ID: " + ref21);
            String ref22 = chalk4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = chalk4.getColor();
            System.out.println("Color: " + ref23);
            String ref24 = chalk4.getShape();
            System.out.println("Shape: " + ref24);
            double ref25 = chalk4.getLength();
            System.out.println("Length: " + ref25);
            boolean ref26 = chalk4.isDustFree();
            System.out.println("Dust Free: " + ref26);
            String ref27 = chalk4.getMaterial();
            System.out.println("Material: " + ref27);
            System.out.println();

            Chalk chalk5 = new Chalk();
            chalk5.setChalkId(5);
            chalk5.setBrand("Navneet");
            chalk5.setColor("Blue");
            chalk5.setShape("Round");
            chalk5.setLength(7.2);
            chalk5.setDustFree(false);
            chalk5.setMaterial("Gypsum");

            int ref28 = chalk5.getChalkId();
            System.out.println("Chalk ID: " + ref28);
            String ref29 = chalk5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = chalk5.getColor();
            System.out.println("Color: " + ref30);
            String ref31 = chalk5.getShape();
            System.out.println("Shape: " + ref31);
            double ref32 = chalk5.getLength();
            System.out.println("Length: " + ref32);
            boolean ref33 = chalk5.isDustFree();
            System.out.println("Dust Free: " + ref33);
            String ref34 = chalk5.getMaterial();
            System.out.println("Material: " + ref34);
            System.out.println();
        }

}
