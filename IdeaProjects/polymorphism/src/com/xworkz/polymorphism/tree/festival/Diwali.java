package com.xworkz.isarelationship.festival;

import com.xworkz.isarelationship.celebration.Celebration;

public class Diwali extends Celebration {
    @Override
    public void decorate() {
        System.out.println("Diwali: Overriding decorate");
    }
    @Override
    public void gather() {
        System.out.println("Diwali: Overriding gather");
    }
    @Override
    public void enjoy() {
        System.out.println("Diwali: Overriding enjoy");
    }
    @Override
    public void conclude() {
        System.out.println("Diwali: Overriding conclude");
    }
}
