package com.xworkz.calendarapp.meetings;

import com.xworkz.calendarapp.invitee.Invitee;

public class Meetings {
   public int meetingId;
  public  String meetingDate;
    public String startTime;
   public String endTime;
   public Invitee invitee[];
   public  void displayDetails(){
       System.out.println("meetingId is: "+meetingId);
       System.out.println("meeting date is:"+meetingDate);
       System.out.println("meeting start time is:"+startTime);
       System.out.println("meeting end time is :"+endTime);
       System.out.println("invitee details are:");
       for(Invitee in:invitee){
           System.out.println(in.getInviteeId());
           System.out.println(in.getName());
           System.out.println(in.getPhoneNumber());
           System.out.println(in.getEmailId());
       }
   }


}
