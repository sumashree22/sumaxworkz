package com.xworkz.mobilecaseapp;

import com.xworkz.mobilecaseapp.accessories.MobileCase;

public class MobileCaseRunner {

        public static void main(String[] args) {

            MobileCase case1 = new MobileCase();
            case1.setCaseId(1);
            case1.setBrand("Spigen");
            case1.setModel("iPhone 14");
            case1.setMaterial("Silicone");
            case1.setColor("Black");
            case1.setPrice(1299.0);
            case1.setWaterproof(true);

            int ref = case1.getCaseId();
            System.out.println("Case ID: " + ref);
            String ref1 = case1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = case1.getModel();
            System.out.println("Model: " + ref2);
            String ref3 = case1.getMaterial();
            System.out.println("Material: " + ref3);
            String ref4 = case1.getColor();
            System.out.println("Color: " + ref4);
            double ref5 = case1.getPrice();
            System.out.println("Price: " + ref5);
            boolean ref6 = case1.isWaterproof();
            System.out.println("Waterproof: " + ref6);
            System.out.println();

            MobileCase case2 = new MobileCase();
            case2.setCaseId(2);
            case2.setBrand("Caseology");
            case2.setModel("Samsung S22");
            case2.setMaterial("TPU");
            case2.setColor("Blue");
            case2.setPrice(999.0);
            case2.setWaterproof(false);

            int ref7 = case2.getCaseId();
            System.out.println("Case ID: " + ref7);
            String ref8 = case2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = case2.getModel();
            System.out.println("Model: " + ref9);
            String ref10 = case2.getMaterial();
            System.out.println("Material: " + ref10);
            String ref11 = case2.getColor();
            System.out.println("Color: " + ref11);
            double ref12 = case2.getPrice();
            System.out.println("Price: " + ref12);
            boolean ref13 = case2.isWaterproof();
            System.out.println("Waterproof: " + ref13);
            System.out.println();

            MobileCase case3 = new MobileCase();
            case3.setCaseId(3);
            case3.setBrand("OtterBox");
            case3.setModel("Pixel 7");
            case3.setMaterial("Plastic");
            case3.setColor("Gray");
            case3.setPrice(1599.0);
            case3.setWaterproof(true);

            int ref14 = case3.getCaseId();
            System.out.println("Case ID: " + ref14);
            String ref15 = case3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = case3.getModel();
            System.out.println("Model: " + ref16);
            String ref17 = case3.getMaterial();
            System.out.println("Material: " + ref17);
            String ref18 = case3.getColor();
            System.out.println("Color: " + ref18);
            double ref19 = case3.getPrice();
            System.out.println("Price: " + ref19);
            boolean ref20 = case3.isWaterproof();
            System.out.println("Waterproof: " + ref20);
            System.out.println();

            MobileCase case4 = new MobileCase();
            case4.setCaseId(4);
            case4.setBrand("Ringke");
            case4.setModel("OnePlus 11");
            case4.setMaterial("Polycarbonate");
            case4.setColor("Transparent");
            case4.setPrice(899.0);
            case4.setWaterproof(false);

            int ref21 = case4.getCaseId();
            System.out.println("Case ID: " + ref21);
            String ref22 = case4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = case4.getModel();
            System.out.println("Model: " + ref23);
            String ref24 = case4.getMaterial();
            System.out.println("Material: " + ref24);
            String ref25 = case4.getColor();
            System.out.println("Color: " + ref25);
            double ref26 = case4.getPrice();
            System.out.println("Price: " + ref26);
            boolean ref27 = case4.isWaterproof();
            System.out.println("Waterproof: " + ref27);
            System.out.println();

            MobileCase case5 = new MobileCase();
            case5.setCaseId(5);
            case5.setBrand("Urban Armor");
            case5.setModel("iPhone 13");
            case5.setMaterial("Rubber");
            case5.setColor("Red");
            case5.setPrice(1899.0);
            case5.setWaterproof(true);

            int ref28 = case5.getCaseId();
            System.out.println("Case ID: " + ref28);
            String ref29 = case5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = case5.getModel();
            System.out.println("Model: " + ref30);
            String ref31 = case5.getMaterial();
            System.out.println("Material: " + ref31);
            String ref32 = case5.getColor();
            System.out.println("Color: " + ref32);
            double ref33 = case5.getPrice();
            System.out.println("Price: " + ref33);
            boolean ref34 = case5.isWaterproof();
            System.out.println("Waterproof: " + ref34);
            System.out.println();
        }

}
