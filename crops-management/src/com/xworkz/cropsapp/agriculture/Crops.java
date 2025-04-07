package com.xworkz.cropsapp.agriculture;

public class Crops {

        private int cropId;
        private String name;
        private String type;
        private String season;
        private double pricePerKg;
        private String origin;
        private String harvestTime;

        public void setCropId(int cropId) {
            this.cropId = cropId;
        }

        public int getCropId() {
            return cropId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public String getSeason() {
            return season;
        }

        public void setPricePerKg(double pricePerKg) {
            this.pricePerKg = pricePerKg;
        }

        public double getPricePerKg() {
            return pricePerKg;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
        }

        public void setHarvestTime(String harvestTime) {
            this.harvestTime = harvestTime;
        }

        public String getHarvestTime() {
            return harvestTime;
        }
}
