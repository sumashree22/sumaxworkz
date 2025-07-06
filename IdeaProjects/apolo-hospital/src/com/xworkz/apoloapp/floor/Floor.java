package com.xworkz.apoloapp.floor;

import com.xworkz.apoloapp.room.Room;

public class Floor {
  public  int floorId;
   public int numberOfRooms;
  public  Room rooms[];

  public void displayDetails(){
      System.out.println("--------------------------");
      System.out.println("floorId is"+floorId);
      System.out.println("number of rooms are"+numberOfRooms);
      for(Room room:rooms){
          room.displayDetails();
      }

      System.out.println("------------------------------");
  }
}
