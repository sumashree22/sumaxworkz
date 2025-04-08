package com.workz.gasgeyserapp.gasgeyser;

public class GasGeyser {

        private String brand;
        private int capacityInLiters;
        private double price;
        private String color;
        private String modelNumber;
        private boolean isAutoIgnition;
        private int warrantyInYears;

        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getBrand() {
            return brand;
        }

        public void setCapacityInLiters(int capacityInLiters) {
            this.capacityInLiters = capacityInLiters;
        }
        public int getCapacityInLiters() {
            return capacityInLiters;
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

        public void setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
        }
        public String getModelNumber() {
            return modelNumber;
        }

        public void setIsAutoIgnition(boolean isAutoIgnition) {
            this.isAutoIgnition = isAutoIgnition;
        }
        public boolean getIsAutoIgnition() {
            return isAutoIgnition;
        }

        public void setWarrantyInYears(int warrantyInYears) {
            this.warrantyInYears = warrantyInYears;
        }
        public int getWarrantyInYears() {
            return warrantyInYears;
        }

}
