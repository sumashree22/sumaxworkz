package com.xworkz.toString.Product;


public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Smartphone");
        product.setCategory("Electronics");
        product.setPrice(25999.99);
        product.setStockQuantity(150);
        product.setManufacturer("Samsung");
        product.setAvailable(true);

        System.out.println(product.toString());
    }
}
