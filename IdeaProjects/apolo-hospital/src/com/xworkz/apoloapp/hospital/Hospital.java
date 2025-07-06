package com.xworkz.apoloapp.hospital;

import com.xworkz.apoloapp.floor.Floor;

public class Hospital {
   public int hospitalId;
  public  String location;
   public String hospitalName;
  public  Floor floors[];

  public  void displayDetails(){
      System.out.println("------------------");
      System.out.println("hospital id is"+hospitalId);
      System.out.println("hospital name is "+hospitalName);
      System.out.println("hospital  location is"+location);
      for(Floor floor:floors){
          floor.displayDetails();
      }
  }
}
