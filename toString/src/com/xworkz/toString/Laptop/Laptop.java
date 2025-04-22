package com.xworkz.toString.Laptop;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Laptop {
    private String brand;
    private String model;
    private double price;
    private String processor;
    private int ramSize; // in GB
    private int storageSize; // in GB
    private String operatingSystem;

    @Override
    public String toString() {
        return "Laptop Details:\n" +
                "Brand = " + this.brand + "\n" +
                "Model = " + this.model + "\n" +
                "Price = ₹" + this.price + "\n" +
                "Processor = " + this.processor + "\n" +
                "RAM Size = " + this.ramSize + " GB\n" +
                "Storage Size = " + this.storageSize + " GB\n" +
                "Operating System = " + this.operatingSystem;
    }
}
