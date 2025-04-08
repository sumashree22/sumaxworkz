package com.xworkz.festivalapp;

import com.xworkz.festivalapp.festival.Festival;

public class FestivalRunner {

        public static void main(String[] args) {

            Festival festival1 = new Festival();
            festival1.setName("Diwali");
            festival1.setLocation("India");
            festival1.setDate("01/11/2025");
            festival1.setDurationInDays(5);
            festival1.setType("Religious");
            festival1.setIsPublicHoliday(true);
            festival1.setOrganizer("Local Community");

            String ref1 = festival1.getName();
            System.out.println("Festival Name: " + ref1);
            String ref2 = festival1.getLocation();
            System.out.println("Location: " + ref2);
            String ref3 = festival1.getDate();
            System.out.println("Date: " + ref3);
            int ref4 = festival1.getDurationInDays();
            System.out.println("Duration (Days): " + ref4);
            String ref5 = festival1.getType();
            System.out.println("Type: " + ref5);
            boolean ref6 = festival1.getIsPublicHoliday();
            System.out.println("Public Holiday: " + ref6);
            String ref7 = festival1.getOrganizer();
            System.out.println("Organizer: " + ref7);
            System.out.println();

            Festival festival2 = new Festival();
            festival2.setName("Holi");
            festival2.setLocation("North India");
            festival2.setDate("06/03/2025");
            festival2.setDurationInDays(2);
            festival2.setType("Cultural");
            festival2.setIsPublicHoliday(true);
            festival2.setOrganizer("Youth Club");

            String ref8 = festival2.getName();
            System.out.println("Festival Name: " + ref8);
            String ref9 = festival2.getLocation();
            System.out.println("Location: " + ref9);
            String ref10 = festival2.getDate();
            System.out.println("Date: " + ref10);
            int ref11 = festival2.getDurationInDays();
            System.out.println("Duration (Days): " + ref11);
            String ref12 = festival2.getType();
            System.out.println("Type: " + ref12);
            boolean ref13 = festival2.getIsPublicHoliday();
            System.out.println("Public Holiday: " + ref13);
            String ref14 = festival2.getOrganizer();
            System.out.println("Organizer: " + ref14);
            System.out.println();

            Festival festival3 = new Festival();
            festival3.setName("Christmas");
            festival3.setLocation("Worldwide");
            festival3.setDate("25/12/2025");
            festival3.setDurationInDays(1);
            festival3.setType("Religious");
            festival3.setIsPublicHoliday(true);
            festival3.setOrganizer("Church");

            String ref15 = festival3.getName();
            System.out.println("Festival Name: " + ref15);
            String ref16 = festival3.getLocation();
            System.out.println("Location: " + ref16);
            String ref17 = festival3.getDate();
            System.out.println("Date: " + ref17);
            int ref18 = festival3.getDurationInDays();
            System.out.println("Duration (Days): " + ref18);
            String ref19 = festival3.getType();
            System.out.println("Type: " + ref19);
            boolean ref20 = festival3.getIsPublicHoliday();
            System.out.println("Public Holiday: " + ref20);
            String ref21 = festival3.getOrganizer();
            System.out.println("Organizer: " + ref21);
            System.out.println();

            Festival festival4 = new Festival();
            festival4.setName("Onam");
            festival4.setLocation("Kerala");
            festival4.setDate("02/09/2025");
            festival4.setDurationInDays(10);
            festival4.setType("Harvest");
            festival4.setIsPublicHoliday(true);
            festival4.setOrganizer("Kerala Government");

            String ref22 = festival4.getName();
            System.out.println("Festival Name: " + ref22);
            String ref23 = festival4.getLocation();
            System.out.println("Location: " + ref23);
            String ref24 = festival4.getDate();
            System.out.println("Date: " + ref24);
            int ref25 = festival4.getDurationInDays();
            System.out.println("Duration (Days): " + ref25);
            String ref26 = festival4.getType();
            System.out.println("Type: " + ref26);
            boolean ref27 = festival4.getIsPublicHoliday();
            System.out.println("Public Holiday: " + ref27);
            String ref28 = festival4.getOrganizer();
            System.out.println("Organizer: " + ref28);
            System.out.println();

            Festival festival5 = new Festival();
            festival5.setName("Ganesh Chaturthi");
            festival5.setLocation("Maharashtra");
            festival5.setDate("18/09/2025");
            festival5.setDurationInDays(10);
            festival5.setType("Religious");
            festival5.setIsPublicHoliday(true);
            festival5.setOrganizer("Ganesh Mandal");

            String ref29 = festival5.getName();
            System.out.println("Festival Name: " + ref29);
            String ref30 = festival5.getLocation();
            System.out.println("Location: " + ref30);
            String ref31 = festival5.getDate();
            System.out.println("Date: " + ref31);
            int ref32 = festival5.getDurationInDays();
            System.out.println("Duration (Days): " + ref32);
            String ref33 = festival5.getType();
            System.out.println("Type: " + ref33);
            boolean ref34 = festival5.getIsPublicHoliday();
            System.out.println("Public Holiday: " + ref34);
            String ref35 = festival5.getOrganizer();
            System.out.println("Organizer: " + ref35);
            System.out.println();
        }

}
