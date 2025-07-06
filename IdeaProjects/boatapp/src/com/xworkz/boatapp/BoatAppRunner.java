package com.xworkz.boatapp;

import com.xworkz.boatapp.boat.Boat;

public class BoatAppRunner {

    //to achieve encapsulation class mus be public
    //data members must be private
    //one default constructor
    //public getters and setters(accessors(getters) and mutators(setters))

    public static void main(String[] args) {
        System.out.println("main method started");
        Boat boat=new Boat();
        boat.setBoatId(1);
        boat.setBoatName("Baba's boat");
        boat.setBoatOwner("sumashree");
        boat.setBoatType("sailing Boat");



        System.out.println("boat id is: "+boat.getBoatId());
        System.out.println("the boat na,e is: "+boat.getBoatName());
        System.out.println("the boat owner name is: "+boat.getBoatOwner());
        System.out.println("the boat type is: "+boat.getBoatType());
        System.out.println("***********************************************");
        System.out.println();

        Boat boat1=new Boat();
        boat1.setBoatId(2);
        boat1.setBoatName("Baba's boat");
        boat1.setBoatOwner("suma");
        //boat1.setBoatType("sailing Boat");

        //external referencing
        int ref=boat1.getBoatId();
        System.out.println("the boat id is: "+ref);
        String ref1= boat1.getBoatName();
        System.out.println("the boat name is: "+ref1);
        String ref2= boat1.getBoatOwner();
        System.out.println("the owner name is:" +ref2);
        String ref3=boat1.getBoatType();
        System.out.println("type of boat is: "+ref3);

        Boat boat2=new Boat();
        boat2.setBoatId(3);
        boat2.setBoatName("excellent Boat");
        boat2.setBoatOwner("raj");
        boat2.setBoatType("sailing boat");



        System.out.println("main method ended");
    }

}
