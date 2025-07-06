package com.xworkz.calendarapp.invitee;

public class Invitee {
   private int inviteeId;
  private  String name;
   private long phoneNumber;
  private  String emailId;

  public void setInviteeId(int inviteeId){

      this.inviteeId=inviteeId;
  }

    public int getInviteeId() {

      return inviteeId;
    }

    public void setName(String name) {

      this.name = name;
    }

    public String getName() {

      return name;
    }

    public void setPhoneNumber(long phoneNumber) {

      this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {

      return phoneNumber;
    }

    public void setEmailId(String emailId) {

      this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }
}
