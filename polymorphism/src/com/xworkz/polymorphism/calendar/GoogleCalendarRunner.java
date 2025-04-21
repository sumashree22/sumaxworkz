package com.xworkz.polymorphism.calendar;

public class GoogleCalendarRunner {

        public static void main(String[] args) {
            System.out.println("--- Calendar ---");
            Calendar calendar = new Calendar();
            calendar.displayDate();
            calendar.setReminder();
            calendar.markHoliday();
            calendar.viewMonth();
            calendar.viewYear();

            System.out.println("--- Calendar as Google Calendar ---");
            Calendar calendar1 = new GoogleCalendar();
            calendar1.displayDate();
            calendar1.setReminder();
            calendar1.markHoliday();
            calendar1.viewMonth();
            calendar1.viewYear();

            System.out.println("--- Google Calendar ---");
            GoogleCalendar googleCalendar = new GoogleCalendar();
            googleCalendar.displayDate();
            googleCalendar.setReminder();
            googleCalendar.markHoliday();
            googleCalendar.viewMonth();
            googleCalendar.viewYear();
        }
    }


