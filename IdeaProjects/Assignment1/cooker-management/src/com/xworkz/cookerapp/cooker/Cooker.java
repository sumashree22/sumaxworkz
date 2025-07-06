package com.xworkz.cookerapp.cooker;

public class Cooker {

        private String brand;
        private int capacityInLiters;
        private String material;
        private double price;
        private int warrantyInYears;
        private boolean isInductionCompatible;
        private String model;

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

        public void setWarrantyInYears(int warrantyInYears) {
            this.warrantyInYears = warrantyInYears;
        }
        public int getWarrantyInYears() {
            return warrantyInYears;
        }

        public void setIsInductionCompatible(boolean isInductionCompatible) {
            this.isInductionCompatible = isInductionCompatible;
        }
        public boolean getIsInductionCompatible() {
            return isInductionCompatible;
        }

        public void setModel(String model) {
            this.model = model;
        }
        public String getModel() {
            return model;
        }

}
