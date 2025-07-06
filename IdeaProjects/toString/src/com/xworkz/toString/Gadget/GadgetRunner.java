package com.xworkz.toString.Gadget;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget gadget = new Gadget();

        gadget.setName("Wireless Headphones");
        gadget.setBrand("Bose");
        gadget.setCategory("Audio");
        gadget.setPrice(15999.99);
        gadget.setWireless(true);
        gadget.setBatteryLife(20); // 20 hours
        gadget.setColor("Black");

        System.out.println(gadget.toString());
    }
}

