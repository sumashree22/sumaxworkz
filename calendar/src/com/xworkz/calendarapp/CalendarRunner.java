package com.xworkz.calendarapp;

import com.xworkz.calendarapp.calendar.Calendar;
import com.xworkz.calendarapp.constants.Days;
import com.xworkz.calendarapp.invitee.Invitee;
import com.xworkz.calendarapp.meetings.Meetings;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar calendar=new Calendar();
        calendar.days= Days.friday;


        Meetings meeting=new Meetings();
        meeting.meetingId=1;
        meeting.meetingDate="12/2/2025";
        meeting.startTime="12.30";
        meeting.endTime="1.30";

        Invitee invitees[] =new Invitee[1];

        Invitee invitee1=new Invitee();
        invitee1.setInviteeId(1);
        invitee1.setName("rama");
        invitee1.setPhoneNumber(8861938137L);
        invitee1.setEmailId("sumashree@gmail.com");
        invitees[0]=invitee1;

        meeting.invitee=invitees;
        calendar.meeting=meeting;
        calendar.displayDetails();




    }
}
