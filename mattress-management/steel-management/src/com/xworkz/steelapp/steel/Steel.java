package com.xworkz.steelapp.steel;

public class Steel {

        private int steelId;
        private String brand;
        private String grade;
        private double pricePerKg;
        private String type;
        private String originCountry;
        private String corrosionResistance;

        public void setSteelId(int steelId) {
            this.steelId = steelId;
        }

        public int getSteelId() {
            return steelId;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }

        public void setPricePerKg(double pricePerKg) {
            this.pricePerKg = pricePerKg;
        }

        public double getPricePerKg() {
            return pricePerKg;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }

        public String getOriginCountry() {
            return originCountry;
        }

        public void setCorrosionResistance(String corrosionResistance) {
            this.corrosionResistance = corrosionResistance;
        }

        public String getCorrosionResistance() {
            return corrosionResistance;
        }
}


