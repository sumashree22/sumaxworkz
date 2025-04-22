package com.xworkz.toString.Smartphone;
public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.setBrand("OnePlus");
        smartphone.setModel("OnePlus 11");
        smartphone.setScreenSize(6.7);
        smartphone.setBatteryCapacity(5000);
        smartphone.setRamSize(12);
        smartphone.setStorageCapacity(256);
        smartphone.set5GEnabled(true);
        smartphone.setPrice(49999.99);

        System.out.println(smartphone.toString());
    }
}

