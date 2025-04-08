package com.xworkz.cookerapp;

import com.xworkz.cookerapp.cooker.Cooker;

public class CookerRunner {

        public static void main(String[] args) {

            Cooker cooker1 = new Cooker();
            cooker1.setBrand("Prestige");
            cooker1.setCapacityInLiters(5);
            cooker1.setMaterial("Aluminium");
            cooker1.setPrice(1800.0);
            cooker1.setWarrantyInYears(2);
            cooker1.setIsInductionCompatible(true);
            cooker1.setModel("Deluxe Alpha");

            String ref1 = cooker1.getBrand();
            System.out.println("Brand: " + ref1);
            int ref2 = cooker1.getCapacityInLiters();
            System.out.println("Capacity: " + ref2);
            String ref3 = cooker1.getMaterial();
            System.out.println("Material: " + ref3);
            double ref4 = cooker1.getPrice();
            System.out.println("Price: " + ref4);
            int ref5 = cooker1.getWarrantyInYears();
            System.out.println("Warranty: " + ref5);
            boolean ref6 = cooker1.getIsInductionCompatible();
            System.out.println("Induction Compatible: " + ref6);
            String ref7 = cooker1.getModel();
            System.out.println("Model: " + ref7);
            System.out.println();

            Cooker cooker2 = new Cooker();
            cooker2.setBrand("Hawkins");
            cooker2.setCapacityInLiters(3);
            cooker2.setMaterial("Stainless Steel");
            cooker2.setPrice(2200.0);
            cooker2.setWarrantyInYears(5);
            cooker2.setIsInductionCompatible(false);
            cooker2.setModel("Contura");

            String ref8 = cooker2.getBrand();
            System.out.println("Brand: " + ref8);
            int ref9 = cooker2.getCapacityInLiters();
            System.out.println("Capacity: " + ref9);
            String ref10 = cooker2.getMaterial();
            System.out.println("Material: " + ref10);
            double ref11 = cooker2.getPrice();
            System.out.println("Price: " + ref11);
            int ref12 = cooker2.getWarrantyInYears();
            System.out.println("Warranty: " + ref12);
            boolean ref13 = cooker2.getIsInductionCompatible();
            System.out.println("Induction Compatible: " + ref13);
            String ref14 = cooker2.getModel();
            System.out.println("Model: " + ref14);
            System.out.println();

            Cooker cooker3 = new Cooker();
            cooker3.setBrand("Butterfly");
            cooker3.setCapacityInLiters(6);
            cooker3.setMaterial("Aluminium");
            cooker3.setPrice(1400.0);
            cooker3.setWarrantyInYears(2);
            cooker3.setIsInductionCompatible(true);
            cooker3.setModel("Curve");

            String ref15 = cooker3.getBrand();
            System.out.println("Brand: " + ref15);
            int ref16 = cooker3.getCapacityInLiters();
            System.out.println("Capacity: " + ref16);
            String ref17 = cooker3.getMaterial();
            System.out.println("Material: " + ref17);
            double ref18 = cooker3.getPrice();
            System.out.println("Price: " + ref18);
            int ref19 = cooker3.getWarrantyInYears();
            System.out.println("Warranty: " + ref19);
            boolean ref20 = cooker3.getIsInductionCompatible();
            System.out.println("Induction Compatible: " + ref20);
            String ref21 = cooker3.getModel();
            System.out.println("Model: " + ref21);
            System.out.println();

            Cooker cooker4 = new Cooker();
            cooker4.setBrand("Pigeon");
            cooker4.setCapacityInLiters(2);
            cooker4.setMaterial("Stainless Steel");
            cooker4.setPrice(1600.0);
            cooker4.setWarrantyInYears(3);
            cooker4.setIsInductionCompatible(false);
            cooker4.setModel("Inox");

            String ref22 = cooker4.getBrand();
            System.out.println("Brand: " + ref22);
            int ref23 = cooker4.getCapacityInLiters();
            System.out.println("Capacity: " + ref23);
            String ref24 = cooker4.getMaterial();
            System.out.println("Material: " + ref24);
            double ref25 = cooker4.getPrice();
            System.out.println("Price: " + ref25);
            int ref26 = cooker4.getWarrantyInYears();
            System.out.println("Warranty: " + ref26);
            boolean ref27 = cooker4.getIsInductionCompatible();
            System.out.println("Induction Compatible: " + ref27);
            String ref28 = cooker4.getModel();
            System.out.println("Model: " + ref28);
            System.out.println();

            Cooker cooker5 = new Cooker();
            cooker5.setBrand("Usha");
            cooker5.setCapacityInLiters(4);
            cooker5.setMaterial("Hard Anodized");
            cooker5.setPrice(2500.0);
            cooker5.setWarrantyInYears(4);
            cooker5.setIsInductionCompatible(true);
            cooker5.setModel("Usha Hard");

            String ref29 = cooker5.getBrand();
            System.out.println("Brand: " + ref29);
            int ref30 = cooker5.getCapacityInLiters();
            System.out.println("Capacity: " + ref30);
            String ref31 = cooker5.getMaterial();
            System.out.println("Material: " + ref31);
            double ref32 = cooker5.getPrice();
            System.out.println("Price: " + ref32);
            int ref33 = cooker5.getWarrantyInYears();
            System.out.println("Warranty: " + ref33);
            boolean ref34 = cooker5.getIsInductionCompatible();
            System.out.println("Induction Compatible: " + ref34);
            String ref35 = cooker5.getModel();
            System.out.println("Model: " + ref35);
            System.out.println();
        }

}
