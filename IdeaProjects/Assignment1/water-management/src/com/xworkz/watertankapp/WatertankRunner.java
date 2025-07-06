package com.xworkz.watertankapp;

import com.xworkz.watertankapp.watertank.WaterTank;

public class WatertankRunner{
        public static void main(String[] args) {

            WaterTank tank1 = new WaterTank();
            tank1.setTankId(1);
            tank1.setBrand("Sintex");
            tank1.setCapacity(1000.0);
            tank1.setColor("Black");
            tank1.setShape("Cylindrical");
            tank1.setMaterial("Plastic");
            tank1.setPrice(3500.0);

            int ref = tank1.getTankId();
            System.out.println("Tank ID: " + ref);
            String ref1 = tank1.getBrand();
            System.out.println("Brand: " + ref1);
            double ref2 = tank1.getCapacity();
            System.out.println("Capacity: " + ref2);
            String ref3 = tank1.getColor();
            System.out.println("Color: " + ref3);
            String ref4 = tank1.getShape();
            System.out.println("Shape: " + ref4);
            String ref5 = tank1.getMaterial();
            System.out.println("Material: " + ref5);
            double ref6 = tank1.getPrice();
            System.out.println("Price: " + ref6);
            System.out.println();

            WaterTank tank2 = new WaterTank();
            tank2.setTankId(2);
            tank2.setBrand("Plasto");
            tank2.setCapacity(500.0);
            tank2.setColor("White");
            tank2.setShape("Square");
            tank2.setMaterial("HDPE");
            tank2.setPrice(2200.0);

            int ref7 = tank2.getTankId();
            System.out.println("Tank ID: " + ref7);
            String ref8 = tank2.getBrand();
            System.out.println("Brand: " + ref8);
            double ref9 = tank2.getCapacity();
            System.out.println("Capacity: " + ref9);
            String ref10 = tank2.getColor();
            System.out.println("Color: " + ref10);
            String ref11 = tank2.getShape();
            System.out.println("Shape: " + ref11);
            String ref12 = tank2.getMaterial();
            System.out.println("Material: " + ref12);
            double ref13 = tank2.getPrice();
            System.out.println("Price: " + ref13);
            System.out.println();

            WaterTank tank3 = new WaterTank();
            tank3.setTankId(3);
            tank3.setBrand("Supreme");
            tank3.setCapacity(750.0);
            tank3.setColor("Green");
            tank3.setShape("Round");
            tank3.setMaterial("Polyethylene");
            tank3.setPrice(2800.0);

            int ref14 = tank3.getTankId();
            System.out.println("Tank ID: " + ref14);
            String ref15 = tank3.getBrand();
            System.out.println("Brand: " + ref15);
            double ref16 = tank3.getCapacity();
            System.out.println("Capacity: " + ref16);
            String ref17 = tank3.getColor();
            System.out.println("Color: " + ref17);
            String ref18 = tank3.getShape();
            System.out.println("Shape: " + ref18);
            String ref19 = tank3.getMaterial();
            System.out.println("Material: " + ref19);
            double ref20 = tank3.getPrice();
            System.out.println("Price: " + ref20);
            System.out.println();

            WaterTank tank4 = new WaterTank();
            tank4.setTankId(4);
            tank4.setBrand("Storewel");
            tank4.setCapacity(2000.0);
            tank4.setColor("Blue");
            tank4.setShape("Vertical");
            tank4.setMaterial("Plastic");
            tank4.setPrice(6000.0);

            int ref21 = tank4.getTankId();
            System.out.println("Tank ID: " + ref21);
            String ref22 = tank4.getBrand();
            System.out.println("Brand: " + ref22);
            double ref23 = tank4.getCapacity();
            System.out.println("Capacity: " + ref23);
            String ref24 = tank4.getColor();
            System.out.println("Color: " + ref24);
            String ref25 = tank4.getShape();
            System.out.println("Shape: " + ref25);
            String ref26 = tank4.getMaterial();
            System.out.println("Material: " + ref26);
            double ref27 = tank4.getPrice();
            System.out.println("Price: " + ref27);
            System.out.println();

            WaterTank tank5 = new WaterTank();
            tank5.setTankId(5);
            tank5.setBrand("Ashirvad");
            tank5.setCapacity(1500.0);
            tank5.setColor("Grey");
            tank5.setShape("Horizontal");
            tank5.setMaterial("PVC");
            tank5.setPrice(4800.0);

            int ref28 = tank5.getTankId();
            System.out.println("Tank ID: " + ref28);
            String ref29 = tank5.getBrand();
            System.out.println("Brand: " + ref29);
            double ref30 = tank5.getCapacity();
            System.out.println("Capacity: " + ref30);
            String ref31 = tank5.getColor();
            System.out.println("Color: " + ref31);
            String ref32 = tank5.getShape();
            System.out.println("Shape: " + ref32);
            String ref33 = tank5.getMaterial();
            System.out.println("Material: " + ref33);
            double ref34 = tank5.getPrice();
            System.out.println("Price: " + ref34);
            System.out.println();
        }
}
