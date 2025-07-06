package com.xworkz.boatapp.boat;

public class Boat {
    private int boatId;
    private String boatName;
    private String boatType;
    private String boatOwner;


    public void setBoatId(int boatId) {
        this.boatId = boatId;
    }

    public int getBoatId() {
        return boatId;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatOwner(String boatOwner) {
        this.boatOwner = boatOwner;
    }

    public String getBoatOwner() {
        return boatOwner;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public String getBoatType() {
        return boatType;
    }
}
