package com.xworkz.inheritance.appliance;

public class ApplianceRunner {

        public static void main(String[] args) {
            Appliance appliance = new Appliance();
            appliance.method1();
            appliance.method2();
            appliance.method3();
            appliance.method4();
            appliance.method5();

            Refrigerator refrigerator = new Refrigerator();
            refrigerator.sub1();
            refrigerator.sub2();
            refrigerator.sub3();
            refrigerator.sub4();
            refrigerator.sub5();

            Appliance appliance1 = new Refrigerator();
            appliance1.method1();
            appliance1.method2();
            appliance1.method3();
            appliance1.method4();
            appliance1.method5();
        }
}
