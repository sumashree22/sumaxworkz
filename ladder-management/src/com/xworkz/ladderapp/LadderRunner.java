package com.xworkz.ladderapp;

import com.xworkz.ladderapp.equipment.Ladder;

public class LadderRunner {

        public static void main(String[] args) {

            Ladder ladder1 = new Ladder();
            ladder1.setLadderId(1);
            ladder1.setBrand("Stira");
            ladder1.setMaterial("Aluminium");
            ladder1.setSteps(5);
            ladder1.setHeight(6.5);
            ladder1.setWeightCapacity(150.0);
            ladder1.setColor("Silver");

            int ref = ladder1.getLadderId();
            System.out.println("Ladder ID: " + ref);
            String ref1 = ladder1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = ladder1.getMaterial();
            System.out.println("Material: " + ref2);
            int ref3 = ladder1.getSteps();
            System.out.println("Steps: " + ref3);
            double ref4 = ladder1.getHeight();
            System.out.println("Height: " + ref4);
            double ref5 = ladder1.getWeightCapacity();
            System.out.println("Weight Capacity: " + ref5);
            String ref6 = ladder1.getColor();
            System.out.println("Color: " + ref6);
            System.out.println();

            Ladder ladder2 = new Ladder();
            ladder2.setLadderId(2);
            ladder2.setBrand("SuperSafe");
            ladder2.setMaterial("Steel");
            ladder2.setSteps(6);
            ladder2.setHeight(7.2);
            ladder2.setWeightCapacity(180.0);
            ladder2.setColor("Grey");

            int ref7 = ladder2.getLadderId();
            System.out.println("Ladder ID: " + ref7);
            String ref8 = ladder2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = ladder2.getMaterial();
            System.out.println("Material: " + ref9);
            int ref10 = ladder2.getSteps();
            System.out.println("Steps: " + ref10);
            double ref11 = ladder2.getHeight();
            System.out.println("Height: " + ref11);
            double ref12 = ladder2.getWeightCapacity();
            System.out.println("Weight Capacity: " + ref12);
            String ref13 = ladder2.getColor();
            System.out.println("Color: " + ref13);
            System.out.println();

            Ladder ladder3 = new Ladder();
            ladder3.setLadderId(3);
            ladder3.setBrand("Hercules");
            ladder3.setMaterial("Fiberglass");
            ladder3.setSteps(4);
            ladder3.setHeight(5.0);
            ladder3.setWeightCapacity(140.0);
            ladder3.setColor("Yellow");

            int ref14 = ladder3.getLadderId();
            System.out.println("Ladder ID: " + ref14);
            String ref15 = ladder3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = ladder3.getMaterial();
            System.out.println("Material: " + ref16);
            int ref17 = ladder3.getSteps();
            System.out.println("Steps: " + ref17);
            double ref18 = ladder3.getHeight();
            System.out.println("Height: " + ref18);
            double ref19 = ladder3.getWeightCapacity();
            System.out.println("Weight Capacity: " + ref19);
            String ref20 = ladder3.getColor();
            System.out.println("Color: " + ref20);
            System.out.println();

            Ladder ladder4 = new Ladder();
            ladder4.setLadderId(4);
            ladder4.setBrand("ProLadder");
            ladder4.setMaterial("Plastic");
            ladder4.setSteps(3);
            ladder4.setHeight(4.5);
            ladder4.setWeightCapacity(100.0);
            ladder4.setColor("Blue");

            int ref21 = ladder4.getLadderId();
            System.out.println("Ladder ID: " + ref21);
            String ref22 = ladder4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = ladder4.getMaterial();
            System.out.println("Material: " + ref23);
            int ref24 = ladder4.getSteps();
            System.out.println("Steps: " + ref24);
            double ref25 = ladder4.getHeight();
            System.out.println("Height: " + ref25);
            double ref26 = ladder4.getWeightCapacity();
            System.out.println("Weight Capacity: " + ref26);
            String ref27 = ladder4.getColor();
            System.out.println("Color: " + ref27);
            System.out.println();

            Ladder ladder5 = new Ladder();
            ladder5.setLadderId(5);
            ladder5.setBrand("ProStep");
            ladder5.setMaterial("Aluminium");
            ladder5.setSteps(7);
            ladder5.setHeight(8.0);
            ladder5.setWeightCapacity(160.0);
            ladder5.setColor("Black");

            int ref28 = ladder5.getLadderId();
            System.out.println("Ladder ID: " + ref28);
            String ref29 = ladder5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = ladder5.getMaterial();
            System.out.println("Material: " + ref30);
            int ref31 = ladder5.getSteps();
            System.out.println("Steps: " + ref31);
            double ref32 = ladder5.getHeight();
            System.out.println("Height: " + ref32);
            double ref33 = ladder5.getWeightCapacity();
            System.out.println("Weight Capacity: " + ref33);
            String ref34 = ladder5.getColor();
            System.out.println("Color: " + ref34);
            System.out.println();
        }

}
