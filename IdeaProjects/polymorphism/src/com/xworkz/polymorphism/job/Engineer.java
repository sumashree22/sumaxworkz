package com.xworkz.isarelationship.job;

import com.xworkz.isarelationship.career.Career;

public class Engineer extends Career {
    @Override
    public void work() {
        System.out.println("Engineer: Overriding work");
    }
    @Override
    public void earn() {
        System.out.println("Engineer: Overriding earn");
    }
    @Override
    public void progress() {
        System.out.println("Engineer: Overriding progress");
    }
    @Override
    public void retire() {
        System.out.println("Engineer: Overriding retire");
    }
}
