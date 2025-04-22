package com.xworkz.toString.Tea;

public class TeaRunner {
    public static void main(String[] args) {
        Tea tea = new Tea();

        tea.setBrand("Twinings");
        tea.setType("Green Tea");
        tea.setWeight(100);
        tea.setPrice(8.50);
        tea.setOrigin("China");
        tea.setOrganic(true);

        System.out.println(tea.toString());
    }
}

