package com.xworkz.watertankapp.watertank;

public class WaterTank {

        private int tankId;
        private String brand;
        private double capacity;
        private String color;
        private String shape;
        private String material;
        private double price;

        public void setTankId(int tankId) {
            this.tankId = tankId;
        }

        public int getTankId() {
            return tankId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        public double getCapacity() {
            return capacity;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }


}
