package com.xworkz.apoloapp.room;

import com.xworkz.apoloapp.constants.RoomType;
import com.xworkz.apoloapp.patient.Patient;

public class Room {
    int roomNumber;
  public RoomType roomType;
  public Patient patients[];
  public void displayDetails(){
      System.out.println("room type is"+roomType);
      for(Patient patient:patients){
          System.out.println("*****************************");
          System.out.println(patient.getPatientId());
          System.out.println(patient.getPatientName());
          System.out.println(patient.getPhoneNumber());
          System.out.println(patient.getAdress());
          System.out.println("*******************************");
      }
  }

}
