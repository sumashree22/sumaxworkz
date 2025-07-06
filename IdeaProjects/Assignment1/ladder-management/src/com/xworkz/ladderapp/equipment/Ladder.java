package com.xworkz.ladderapp.equipment;

public class Ladder {

        private int ladderId;
        private String brand;
        private String material;
        private int steps;
        private double height;
        private double weightCapacity;
        private String color;

        public void setLadderId(int ladderId) {
            this.ladderId = ladderId;
        }

        public int getLadderId() {
            return ladderId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }

        public int getSteps() {
            return steps;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setWeightCapacity(double weightCapacity) {
            this.weightCapacity = weightCapacity;
        }

        public double getWeightCapacity() {
            return weightCapacity;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

}
