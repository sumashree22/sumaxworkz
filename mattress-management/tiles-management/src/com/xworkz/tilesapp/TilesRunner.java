package com.xworkz.tilesapp;

import com.xworkz.tilesapp.tiles.Tiles;

public class TilesRunner {

        public static void main(String[] args) {

            Tiles tile1 = new Tiles();
            tile1.setTileId(1);
            tile1.setBrand("Kajaria");
            tile1.setColor("White");
            tile1.setPrice(65.5);
            tile1.setMaterial("Ceramic");
            tile1.setSize("2x2 feet");
            tile1.setFinishType("Glossy");

            int ref = tile1.getTileId();
            System.out.println("Tile ID: " + ref);
            String ref1 = tile1.getBrand();
            System.out.println("Brand: " + ref1);
            String ref2 = tile1.getColor();
            System.out.println("Color: " + ref2);
            double ref3 = tile1.getPrice();
            System.out.println("Price: " + ref3);
            String ref4 = tile1.getMaterial();
            System.out.println("Material: " + ref4);
            String ref5 = tile1.getSize();
            System.out.println("Size: " + ref5);
            String ref6 = tile1.getFinishType();
            System.out.println("Finish Type: " + ref6);
            System.out.println();

            Tiles tile2 = new Tiles();
            tile2.setTileId(2);
            tile2.setBrand("Somany");
            tile2.setColor("Grey");
            tile2.setPrice(70.0);
            tile2.setMaterial("Vitrified");
            tile2.setSize("2x4 feet");
            tile2.setFinishType("Matte");

            int ref7 = tile2.getTileId();
            System.out.println("Tile ID: " + ref7);
            String ref8 = tile2.getBrand();
            System.out.println("Brand: " + ref8);
            String ref9 = tile2.getColor();
            System.out.println("Color: " + ref9);
            double ref10 = tile2.getPrice();
            System.out.println("Price: " + ref10);
            String ref11 = tile2.getMaterial();
            System.out.println("Material: " + ref11);
            String ref12 = tile2.getSize();
            System.out.println("Size: " + ref12);
            String ref13 = tile2.getFinishType();
            System.out.println("Finish Type: " + ref13);
            System.out.println();

            Tiles tile3 = new Tiles();
            tile3.setTileId(3);
            tile3.setBrand("Nitco");
            tile3.setColor("Beige");
            tile3.setPrice(80.0);
            tile3.setMaterial("Porcelain");
            tile3.setSize("1x1 feet");
            tile3.setFinishType("Textured");

            int ref14 = tile3.getTileId();
            System.out.println("Tile ID: " + ref14);
            String ref15 = tile3.getBrand();
            System.out.println("Brand: " + ref15);
            String ref16 = tile3.getColor();
            System.out.println("Color: " + ref16);
            double ref17 = tile3.getPrice();
            System.out.println("Price: " + ref17);
            String ref18 = tile3.getMaterial();
            System.out.println("Material: " + ref18);
            String ref19 = tile3.getSize();
            System.out.println("Size: " + ref19);
            String ref20 = tile3.getFinishType();
            System.out.println("Finish Type: " + ref20);
            System.out.println();

            Tiles tile4 = new Tiles();
            tile4.setTileId(4);
            tile4.setBrand("Johnson");
            tile4.setColor("Black");
            tile4.setPrice(90.0);
            tile4.setMaterial("Granite");
            tile4.setSize("3x3 feet");
            tile4.setFinishType("Polished");

            int ref21 = tile4.getTileId();
            System.out.println("Tile ID: " + ref21);
            String ref22 = tile4.getBrand();
            System.out.println("Brand: " + ref22);
            String ref23 = tile4.getColor();
            System.out.println("Color: " + ref23);
            double ref24 = tile4.getPrice();
            System.out.println("Price: " + ref24);
            String ref25 = tile4.getMaterial();
            System.out.println("Material: " + ref25);
            String ref26 = tile4.getSize();
            System.out.println("Size: " + ref26);
            String ref27 = tile4.getFinishType();
            System.out.println("Finish Type: " + ref27);
            System.out.println();

            Tiles tile5 = new Tiles();
            tile5.setTileId(5);
            tile5.setBrand("Asian Granito");
            tile5.setColor("Marble White");
            tile5.setPrice(100.0);
            tile5.setMaterial("Marble");
            tile5.setSize("2x6 feet");
            tile5.setFinishType("Glossy");

            int ref28 = tile5.getTileId();
            System.out.println("Tile ID: " + ref28);
            String ref29 = tile5.getBrand();
            System.out.println("Brand: " + ref29);
            String ref30 = tile5.getColor();
            System.out.println("Color: " + ref30);
            double ref31 = tile5.getPrice();
            System.out.println("Price: " + ref31);
            String ref32 = tile5.getMaterial();
            System.out.println("Material: " + ref32);
            String ref33 = tile5.getSize();
            System.out.println("Size: " + ref33);
            String ref34 = tile5.getFinishType();
            System.out.println("Finish Type: " + ref34);
            System.out.println();
        }

}
