package com.xworkz.toString.Shop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Shop {
    private String name;
    private String location;
    private String category; // e.g., Clothing, Electronics, Groceries
    private double revenue; // in USD
    private int employeesCount;
    private String[] productsSold;

    @Override
    public String toString() {
        return "Shop Details:\n" +
                "Name = " + this.name + "\n" +
                "Location = " + this.location + "\n" +
                "Category = " + this.category + "\n" +
                "Revenue = $" + this.revenue + "\n" +
                "Employees Count = " + this.employeesCount + "\n" +
                "Products Sold = " + String.join(", ", this.productsSold);
    }
}

