package com.xworkz.markerapp.marker;

public class Marker {

        private int markerId;
        private String brand;
        private String color;
        private double price;
        private String inkType;
        private String bodyMaterial;
        private String tipType;

        public void setMarkerId(int markerId) {
            this.markerId = markerId;
        }

        public int getMarkerId() {
            return markerId;
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

        public void setInkType(String inkType) {
            this.inkType = inkType;
        }

        public String getInkType() {
            return inkType;
        }

        public void setBodyMaterial(String bodyMaterial) {
            this.bodyMaterial = bodyMaterial;
        }

        public String getBodyMaterial() {
            return bodyMaterial;
        }

        public void setTipType(String tipType) {
            this.tipType = tipType;
        }

        public String getTipType() {
            return tipType;
        }
}
