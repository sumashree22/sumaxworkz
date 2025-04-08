package com.xworkz.shirtapp.shirt;

public class Shirt {

        private int shirtId;
        private String brand;
        private String size;
        private double price;
        private String color;
        private String material;
        private String sleeveType;

        public void setShirtId(int shirtId) {
            this.shirtId = shirtId;
        }

        public int getShirtId() {
            return shirtId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setSleeveType(String sleeveType) {
            this.sleeveType = sleeveType;
        }

        public String getSleeveType() {
            return sleeveType;
        }

}
