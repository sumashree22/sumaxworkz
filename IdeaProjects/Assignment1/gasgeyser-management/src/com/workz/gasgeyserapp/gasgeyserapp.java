package com.workz.gasgeyserapp;

import com.workz.gasgeyserapp.gasgeyser.GasGeyser;

public class gasgeyserapp {

        public static void main(String[] args) {

            GasGeyser geyser1 = new GasGeyser();
            geyser1.setBrand("Bajaj");
            geyser1.setCapacityInLiters(6);
            geyser1.setPrice(4999.0);
            geyser1.setColor("White");
            geyser1.setModelNumber("GX06");
            geyser1.setIsAutoIgnition(true);
            geyser1.setWarrantyInYears(2);

            String ref1 = geyser1.getBrand();
            System.out.println("Brand: " + ref1);
            int ref2 = geyser1.getCapacityInLiters();
            System.out.println("Capacity: " + ref2 + "L");
            double ref3 = geyser1.getPrice();
            System.out.println("Price: " + ref3);
            String ref4 = geyser1.getColor();
            System.out.println("Color: " + ref4);
            String ref5 = geyser1.getModelNumber();
            System.out.println("Model Number: " + ref5);
            boolean ref6 = geyser1.getIsAutoIgnition();
            System.out.println("Auto Ignition: " + ref6);
            int ref7 = geyser1.getWarrantyInYears();
            System.out.println("Warranty: " + ref7 + " years");
            System.out.println();

            GasGeyser geyser2 = new GasGeyser();
            geyser2.setBrand("Hindware");
            geyser2.setCapacityInLiters(7);
            geyser2.setPrice(5799.0);
            geyser2.setColor("Silver");
            geyser2.setModelNumber("HW07");
            geyser2.setIsAutoIgnition(false);
            geyser2.setWarrantyInYears(3);

            String ref8 = geyser2.getBrand();
            System.out.println("Brand: " + ref8);
            int ref9 = geyser2.getCapacityInLiters();
            System.out.println("Capacity: " + ref9 + "L");
            double ref10 = geyser2.getPrice();
            System.out.println("Price: " + ref10);
            String ref11 = geyser2.getColor();
            System.out.println("Color: " + ref11);
            String ref12 = geyser2.getModelNumber();
            System.out.println("Model Number: " + ref12);
            boolean ref13 = geyser2.getIsAutoIgnition();
            System.out.println("Auto Ignition: " + ref13);
            int ref14 = geyser2.getWarrantyInYears();
            System.out.println("Warranty: " + ref14 + " years");
            System.out.println();

            GasGeyser geyser3 = new GasGeyser();
            geyser3.setBrand("V-Guard");
            geyser3.setCapacityInLiters(10);
            geyser3.setPrice(6499.0);
            geyser3.setColor("Grey");
            geyser3.setModelNumber("VG10");
            geyser3.setIsAutoIgnition(true);
            geyser3.setWarrantyInYears(2);

            String ref15 = geyser3.getBrand();
            System.out.println("Brand: " + ref15);
            int ref16 = geyser3.getCapacityInLiters();
            System.out.println("Capacity: " + ref16 + "L");
            double ref17 = geyser3.getPrice();
            System.out.println("Price: " + ref17);
            String ref18 = geyser3.getColor();
            System.out.println("Color: " + ref18);
            String ref19 = geyser3.getModelNumber();
            System.out.println("Model Number: " + ref19);
            boolean ref20 = geyser3.getIsAutoIgnition();
            System.out.println("Auto Ignition: " + ref20);
            int ref21 = geyser3.getWarrantyInYears();
            System.out.println("Warranty: " + ref21 + " years");
            System.out.println();

            GasGeyser geyser4 = new GasGeyser();
            geyser4.setBrand("Racold");
            geyser4.setCapacityInLiters(8);
            geyser4.setPrice(5999.0);
            geyser4.setColor("Black");
            geyser4.setModelNumber("R08");
            geyser4.setIsAutoIgnition(true);
            geyser4.setWarrantyInYears(1);

            String ref22 = geyser4.getBrand();
            System.out.println("Brand: " + ref22);
            int ref23 = geyser4.getCapacityInLiters();
            System.out.println("Capacity: " + ref23 + "L");
            double ref24 = geyser4.getPrice();
            System.out.println("Price: " + ref24);
            String ref25 = geyser4.getColor();
            System.out.println("Color: " + ref25);
            String ref26 = geyser4.getModelNumber();
            System.out.println("Model Number: " + ref26);
            boolean ref27 = geyser4.getIsAutoIgnition();
            System.out.println("Auto Ignition: " + ref27);
            int ref28 = geyser4.getWarrantyInYears();
            System.out.println("Warranty: " + ref28 + " years");
            System.out.println();

            GasGeyser geyser5 = new GasGeyser();
            geyser5.setBrand("AO Smith");
            geyser5.setCapacityInLiters(6);
            geyser5.setPrice(7200.0);
            geyser5.setColor("Ivory");
            geyser5.setModelNumber("AOS06");
            geyser5.setIsAutoIgnition(false);
            geyser5.setWarrantyInYears(4);

            String ref29 = geyser5.getBrand();
            System.out.println("Brand: " + ref29);
            int ref30 = geyser5.getCapacityInLiters();
            System.out.println("Capacity: " + ref30 + "L");
            double ref31 = geyser5.getPrice();
            System.out.println("Price: " + ref31);
            String ref32 = geyser5.getColor();
            System.out.println("Color: " + ref32);
            String ref33 = geyser5.getModelNumber();
            System.out.println("Model Number: " + ref33);
            boolean ref34 = geyser5.getIsAutoIgnition();
            System.out.println("Auto Ignition: " + ref34);
            int ref35 = geyser5.getWarrantyInYears();
            System.out.println("Warranty: " + ref35 + " years");
            System.out.println();
        }

}
