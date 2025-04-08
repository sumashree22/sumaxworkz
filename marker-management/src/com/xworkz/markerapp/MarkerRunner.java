package com.xworkz.markerapp;

import com.xworkz.markerapp.marker.Marker;

public class MarkerRunner {

        public static void main(String[] args) {

            Marker marker1 = new Marker();
            marker1.setMarkerId(1);
            marker1.setBrand("Camlin");
            marker1.setColor("Black");
            marker1.setPrice(25.0);
            marker1.setInkType("Permanent");
            marker1.setBodyMaterial("Plastic");
            marker1.setTipType("Chisel");

            int ref = marker1.getMarkerId();
            System.out.println("Marker ID: " + ref);
            String ref1 = marker1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = marker1.getColor();
            System.out.println("Color: " + ref2);
            double ref3 = marker1.getPrice();
            System.out.println("Price: " + ref3);
            String ref4 = marker1.getInkType();
            System.out.println("Ink Type: " + ref4);
            String ref5 = marker1.getBodyMaterial();
            System.out.println("Body Material: " + ref5);
            String ref6 = marker1.getTipType();
            System.out.println("Tip Type: " + ref6);
            System.out.println();

            Marker marker2 = new Marker();
            marker2.setMarkerId(2);
            marker2.setBrand("Faber-Castell");
            marker2.setColor("Blue");
            marker2.setPrice(30.0);
            marker2.setInkType("Dry-erase");
            marker2.setBodyMaterial("Plastic");
            marker2.setTipType("Bullet");

            int ref7 = marker2.getMarkerId();
            System.out.println("Marker ID: " + ref7);
            String ref8 = marker2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = marker2.getColor();
            System.out.println("Color: " + ref9);
            double ref10 = marker2.getPrice();
            System.out.println("Price: " + ref10);
            String ref11 = marker2.getInkType();
            System.out.println("Ink Type: " + ref11);
            String ref12 = marker2.getBodyMaterial();
            System.out.println("Body Material: " + ref12);
            String ref13 = marker2.getTipType();
            System.out.println("Tip Type: " + ref13);
            System.out.println();

            Marker marker3 = new Marker();
            marker3.setMarkerId(3);
            marker3.setBrand("Cello");
            marker3.setColor("Red");
            marker3.setPrice(20.0);
            marker3.setInkType("Water-based");
            marker3.setBodyMaterial("Plastic");
            marker3.setTipType("Fine");

            int ref14 = marker3.getMarkerId();
            System.out.println("Marker ID: " + ref14);
            String ref15 = marker3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = marker3.getColor();
            System.out.println("Color: " + ref16);
            double ref17 = marker3.getPrice();
            System.out.println("Price: " + ref17);
            String ref18 = marker3.getInkType();
            System.out.println("Ink Type: " + ref18);
            String ref19 = marker3.getBodyMaterial();
            System.out.println("Body Material: " + ref19);
            String ref20 = marker3.getTipType();
            System.out.println("Tip Type: " + ref20);
            System.out.println();

            Marker marker4 = new Marker();
            marker4.setMarkerId(4);
            marker4.setBrand("Luxor");
            marker4.setColor("Green");
            marker4.setPrice(35.0);
            marker4.setInkType("Permanent");
            marker4.setBodyMaterial("Metal");
            marker4.setTipType("Medium");

            int ref21 = marker4.getMarkerId();
            System.out.println("Marker ID: " + ref21);
            String ref22 = marker4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = marker4.getColor();
            System.out.println("Color: " + ref23);
            double ref24 = marker4.getPrice();
            System.out.println("Price: " + ref24);
            String ref25 = marker4.getInkType();
            System.out.println("Ink Type: " + ref25);
            String ref26 = marker4.getBodyMaterial();
            System.out.println("Body Material: " + ref26);
            String ref27 = marker4.getTipType();
            System.out.println("Tip Type: " + ref27);
            System.out.println();

            Marker marker5 = new Marker();
            marker5.setMarkerId(5);
            marker5.setBrand("Reynolds");
            marker5.setColor("Purple");
            marker5.setPrice(40.0);
            marker5.setInkType("Gel-based");
            marker5.setBodyMaterial("Plastic");
            marker5.setTipType("Ultra Fine");

            int ref28 = marker5.getMarkerId();
            System.out.println("Marker ID: " + ref28);
            String ref29 = marker5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = marker5.getColor();
            System.out.println("Color: " + ref30);
            double ref31 = marker5.getPrice();
            System.out.println("Price: " + ref31);
            String ref32 = marker5.getInkType();
            System.out.println("Ink Type: " + ref32);
            String ref33 = marker5.getBodyMaterial();
            System.out.println("Body Material: " + ref33);
            String ref34 = marker5.getTipType();
            System.out.println("Tip Type: " + ref34);
            System.out.println();
        }


}
