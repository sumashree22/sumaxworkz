package com.xworkz.toString.Product;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private String name;
    private String category;
    private double price;
    private int stockQuantity;
    private String manufacturer;
    private boolean isAvailable;

    @Override
    public String toString() {
        return "Product Details:\n" +
                "Name = " + this.name + "\n" +
                "Category = " + this.category + "\n" +
                "Price = ₹" + this.price + "\n" +
                "Stock Quantity = " + this.stockQuantity + "\n" +
                "Manufacturer = " + this.manufacturer + "\n" +
                "Is Available = " + this.isAvailable;
    }
}

