package com.xworkz.toString.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setBrand("Apple");
        laptop.setModel("MacBook Air M1");
        laptop.setPrice(99999.99);
        laptop.setProcessor("Apple M1");
        laptop.setRamSize(8);
        laptop.setStorageSize(256);
        laptop.setOperatingSystem("macOS");

        System.out.println(laptop.toString());
    }
}

