package com.xworkz.lipstickapp.lipstick;

public class Lipstick {
  private  int lipstickId;
  private  String brand;
   private String shade;
   private double price;
   private String texture;
   private String expiryDate;
  private  String quantity;


    public void setLipstickId(int lipstickId) {
        this.lipstickId = lipstickId;
    }
    public int getLipstickId(){
        return lipstickId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }
    public String getShade(){
        return shade;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }
}
