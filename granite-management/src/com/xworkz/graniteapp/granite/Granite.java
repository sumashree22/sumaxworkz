package com.xworkz.graniteapp.granite;

public class Granite {

        private int graniteId;
        private String type;
        private String origin;
        private double price;
        private String color;
        private String finish;
        private String dimensions;  // 7th variable

        public void setGraniteId(int graniteId) {
            this.graniteId = graniteId;
        }

        public int getGraniteId() {
            return graniteId;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getOrigin() {
            return origin;
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

        public void setFinish(String finish) {
            this.finish = finish;
        }

        public String getFinish() {
            return finish;
        }

        public void setDimensions(String dimensions) {
            this.dimensions = dimensions;
        }

        public String getDimensions() {
            return dimensions;
        }
}
