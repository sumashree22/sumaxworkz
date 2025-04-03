package com.xworkz.calendarapp.calendar;

import com.xworkz.calendarapp.constants.Days;
import com.xworkz.calendarapp.meetings.Meetings;

public class Calendar {
    public Days days;
    public Meetings meeting;

    public void displayDetails(){

        System.out.println("meeting day is: "+days);
        System.out.println("meeting details are: ");
        meeting.displayDetails();
    }

}
