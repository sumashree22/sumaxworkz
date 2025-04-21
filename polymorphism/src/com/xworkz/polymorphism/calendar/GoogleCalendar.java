package com.xworkz.polymorphism.calendar;

public class GoogleCalendar  extends Calendar{


        @Override
        public void displayDate() {
            System.out.println("Google Calendar: Displaying the current date with a digital format.");
        }

        @Override
        public void setReminder() {
            System.out.println("Google Calendar: Setting a reminder for an event with notifications.");
        }

        @Override
        public void markHoliday() {
            System.out.println("Google Calendar: Marking holidays with color-coding and syncing across devices.");
        }

        @Override
        public void viewMonth() {
            System.out.println("Google Calendar: Viewing the month with options to add events and sync.");
        }

        @Override
        public void viewYear() {
            System.out.println("Google Calendar: Viewing the year with the ability to search for specific events.");
        }
    }


