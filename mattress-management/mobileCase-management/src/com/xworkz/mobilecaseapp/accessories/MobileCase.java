package com.xworkz.mobilecaseapp.accessories;

public class MobileCase {

        private int caseId;
        private String brand;
        private String model;
        private String material;
        private String color;
        private double price;
        private boolean waterproof;

        public void setCaseId(int caseId) {
            this.caseId = caseId;
        }

        public int getCaseId() {
            return caseId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getMaterial() {
            return material;
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

        public void setWaterproof(boolean waterproof) {
            this.waterproof = waterproof;
        }

        public boolean isWaterproof() {
            return waterproof;
        }

}
