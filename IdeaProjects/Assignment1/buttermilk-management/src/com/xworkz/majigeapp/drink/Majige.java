package com.xworkz.majigeapp.drink;

public class Majige {

        private int id;
        private String brand;
        private String flavor;
        private double price;
        private String quantity;
        private String packagingType;
        private String expiryDate;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

        public String getFlavor() {
            return flavor;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setPackagingType(String packagingType) {
            this.packagingType = packagingType;
        }

        public String getPackagingType() {
            return packagingType;
        }

        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

}
