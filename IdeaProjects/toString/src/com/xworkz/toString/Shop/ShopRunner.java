package com.xworkz.toString.Shop;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.setName("Techie Gadgets");
        shop.setLocation("San Francisco, CA");
        shop.setCategory("Electronics");
        shop.setRevenue(500000);
        shop.setEmployeesCount(25);
        shop.setProductsSold(new String[]{"Laptops", "Smartphones", "Headphones", "Smartwatches"});

        System.out.println(shop.toString());
    }
}

