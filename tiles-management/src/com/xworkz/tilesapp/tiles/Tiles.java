package com.xworkz.tilesapp.tiles;

public class Tiles {

        private int tileId;
        private String brand;
        private String color;
        private double price;
        private String material;
        private String size;
        private String finishType;

        public void setTileId(int tileId) {
            this.tileId = tileId;
        }

        public int getTileId() {
            return tileId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setFinishType(String finishType) {
            this.finishType = finishType;
        }

        public String getFinishType() {
            return finishType;
        }

}
