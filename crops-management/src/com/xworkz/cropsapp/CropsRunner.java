package com.xworkz.cropsapp;

import com.xworkz.cropsapp.agriculture.Crops;

public class CropsRunner {

        public static void main(String[] args) {

            Crops crop1 = new Crops();
            crop1.setCropId(1);
            crop1.setName("Wheat");
            crop1.setType("Rabi");
            crop1.setSeason("Winter");
            crop1.setPricePerKg(25.5);
            crop1.setOrigin("Punjab");
            crop1.setHarvestTime("120 days");

            int ref = crop1.getCropId();
            System.out.println("Crop ID: " + ref);
            String ref1 = crop1.getName();
            System.out.println("Name: " + ref1);
            String ref2 = crop1.getType();
            System.out.println("Type: " + ref2);
            String ref3 = crop1.getSeason();
            System.out.println("Season: " + ref3);
            double ref4 = crop1.getPricePerKg();
            System.out.println("Price per Kg: " + ref4);
            String ref5 = crop1.getOrigin();
            System.out.println("Origin: " + ref5);
            String ref6 = crop1.getHarvestTime();
            System.out.println("Harvest Time: " + ref6);
            System.out.println();

            Crops crop2 = new Crops();
            crop2.setCropId(2);
            crop2.setName("Rice");
            crop2.setType("Kharif");
            crop2.setSeason("Monsoon");
            crop2.setPricePerKg(30.0);
            crop2.setOrigin("Karnataka");
            crop2.setHarvestTime("150 days");

            int ref7 = crop2.getCropId();
            System.out.println("Crop ID: " + ref7);
            String ref8 = crop2.getName();
            System.out.println("Name: " + ref8);
            String ref9 = crop2.getType();
            System.out.println("Type: " + ref9);
            String ref10 = crop2.getSeason();
            System.out.println("Season: " + ref10);
            double ref11 = crop2.getPricePerKg();
            System.out.println("Price per Kg: " + ref11);
            String ref12 = crop2.getOrigin();
            System.out.println("Origin: " + ref12);
            String ref13 = crop2.getHarvestTime();
            System.out.println("Harvest Time: " + ref13);
            System.out.println();

            Crops crop3 = new Crops();
            crop3.setCropId(3);
            crop3.setName("Maize");
            crop3.setType("Zaid");
            crop3.setSeason("Summer");
            crop3.setPricePerKg(22.0);
            crop3.setOrigin("Madhya Pradesh");
            crop3.setHarvestTime("100 days");

            int ref14 = crop3.getCropId();
            System.out.println("Crop ID: " + ref14);
            String ref15 = crop3.getName();
            System.out.println("Name: " + ref15);
            String ref16 = crop3.getType();
            System.out.println("Type: " + ref16);
            String ref17 = crop3.getSeason();
            System.out.println("Season: " + ref17);
            double ref18 = crop3.getPricePerKg();
            System.out.println("Price per Kg: " + ref18);
            String ref19 = crop3.getOrigin();
            System.out.println("Origin: " + ref19);
            String ref20 = crop3.getHarvestTime();
            System.out.println("Harvest Time: " + ref20);
            System.out.println();

            Crops crop4 = new Crops();
            crop4.setCropId(4);
            crop4.setName("Barley");
            crop4.setType("Rabi");
            crop4.setSeason("Winter");
            crop4.setPricePerKg(18.5);
            crop4.setOrigin("Haryana");
            crop4.setHarvestTime("110 days");

            int ref21 = crop4.getCropId();
            System.out.println("Crop ID: " + ref21);
            String ref22 = crop4.getName();
            System.out.println("Name: " + ref22);
            String ref23 = crop4.getType();
            System.out.println("Type: " + ref23);
            String ref24 = crop4.getSeason();
            System.out.println("Season: " + ref24);
            double ref25 = crop4.getPricePerKg();
            System.out.println("Price per Kg: " + ref25);
            String ref26 = crop4.getOrigin();
            System.out.println("Origin: " + ref26);
            String ref27 = crop4.getHarvestTime();
            System.out.println("Harvest Time: " + ref27);
            System.out.println();

            Crops crop5 = new Crops();
            crop5.setCropId(5);
            crop5.setName("Cotton");
            crop5.setType("Kharif");
            crop5.setSeason("Monsoon");
            crop5.setPricePerKg(45.0);
            crop5.setOrigin("Maharashtra");
            crop5.setHarvestTime("180 days");

            int ref28 = crop5.getCropId();
            System.out.println("Crop ID: " + ref28);
            String ref29 = crop5.getName();
            System.out.println("Name: " + ref29);
            String ref30 = crop5.getType();
            System.out.println("Type: " + ref30);
            String ref31 = crop5.getSeason();
            System.out.println("Season: " + ref31);
            double ref32 = crop5.getPricePerKg();
            System.out.println("Price per Kg: " + ref32);
            String ref33 = crop5.getOrigin();
            System.out.println("Origin: " + ref33);
            String ref34 = crop5.getHarvestTime();
            System.out.println("Harvest Time: " + ref34);
            System.out.println();
        }

}
