package com.xworkz.mattressapp.furniture;

public class Mattress {

        private int mattressId;
        private String brand;
        private String size;
        private String material;
        private double thickness;
        private double price;
        private String color;

        public void setMattressId(int mattressId) {
            this.mattressId = mattressId;
        }

        public int getMattressId() {
            return mattressId;
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

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setThickness(double thickness) {
            this.thickness = thickness;
        }

        public double getThickness() {
            return thickness;
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

}
