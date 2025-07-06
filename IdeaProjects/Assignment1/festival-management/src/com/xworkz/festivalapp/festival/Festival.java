package com.xworkz.festivalapp.festival;

public class Festival {

        private String name;
        private String location;
        private String date;
        private int durationInDays;
        private String type;
        private boolean isPublicHoliday;
        private String organizer;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setLocation(String location) {
            this.location = location;
        }
        public String getLocation() {
            return location;
        }

        public void setDate(String date) {
            this.date = date;
        }
        public String getDate() {
            return date;
        }

        public void setDurationInDays(int durationInDays) {
            this.durationInDays = durationInDays;
        }
        public int getDurationInDays() {
            return durationInDays;
        }

        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

        public void setIsPublicHoliday(boolean isPublicHoliday) {
            this.isPublicHoliday = isPublicHoliday;
        }
        public boolean getIsPublicHoliday() {
            return isPublicHoliday;
        }

        public void setOrganizer(String organizer) {
            this.organizer = organizer;
        }
        public String getOrganizer() {
            return organizer;
        }

}
