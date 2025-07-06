package com.xworkz.simcardapp;

import com.xworkz.simcardapp.sim.SimCard;

public class SimCardRunner {

        public static void main(String[] args) {

            SimCard sim1 = new SimCard();
            sim1.setSimId(1);
            sim1.setNetworkProvider("Jio");
            sim1.setSimType("4G");
            sim1.setPhoneNumber("9876543210");
            sim1.setBalance(50.0);
            sim1.setIsActive(true);
            sim1.setExpiryDate("31/12/2026");

            int ref = sim1.getSimId();
            System.out.println("Sim ID: " + ref);
            String ref1 = sim1.getNetworkProvider();
            System.out.println("Network Provider: " + ref1);
            String ref2 = sim1.getSimType();
            System.out.println("Sim Type: " + ref2);
            String ref3 = sim1.getPhoneNumber();
            System.out.println("Phone Number: " + ref3);
            double ref4 = sim1.getBalance();
            System.out.println("Balance: " + ref4);
            boolean ref5 = sim1.getIsActive();
            System.out.println("Is Active: " + ref5);
            String ref6 = sim1.getExpiryDate();
            System.out.println("Expiry Date: " + ref6);
            System.out.println();

            SimCard sim2 = new SimCard();
            sim2.setSimId(2);
            sim2.setNetworkProvider("Airtel");
            sim2.setSimType("5G");
            sim2.setPhoneNumber("9123456780");
            sim2.setBalance(120.0);
            sim2.setIsActive(true);
            sim2.setExpiryDate("01/01/2027");

            int ref7 = sim2.getSimId();
            System.out.println("Sim ID: " + ref7);
            String ref8 = sim2.getNetworkProvider();
            System.out.println("Network Provider: " + ref8);
            String ref9 = sim2.getSimType();
            System.out.println("Sim Type: " + ref9);
            String ref10 = sim2.getPhoneNumber();
            System.out.println("Phone Number: " + ref10);
            double ref11 = sim2.getBalance();
            System.out.println("Balance: " + ref11);
            boolean ref12 = sim2.getIsActive();
            System.out.println("Is Active: " + ref12);
            String ref13 = sim2.getExpiryDate();
            System.out.println("Expiry Date: " + ref13);
            System.out.println();

            SimCard sim3 = new SimCard();
            sim3.setSimId(3);
            sim3.setNetworkProvider("Vi");
            sim3.setSimType("4G");
            sim3.setPhoneNumber("7890123456");
            sim3.setBalance(10.0);
            sim3.setIsActive(false);
            sim3.setExpiryDate("15/08/2025");

            int ref14 = sim3.getSimId();
            System.out.println("Sim ID: " + ref14);
            String ref15 = sim3.getNetworkProvider();
            System.out.println("Network Provider: " + ref15);
            String ref16 = sim3.getSimType();
            System.out.println("Sim Type: " + ref16);
            String ref17 = sim3.getPhoneNumber();
            System.out.println("Phone Number: " + ref17);
            double ref18 = sim3.getBalance();
            System.out.println("Balance: " + ref18);
            boolean ref19 = sim3.getIsActive();
            System.out.println("Is Active: " + ref19);
            String ref20 = sim3.getExpiryDate();
            System.out.println("Expiry Date: " + ref20);
            System.out.println();

            SimCard sim4 = new SimCard();
            sim4.setSimId(4);
            sim4.setNetworkProvider("BSNL");
            sim4.setSimType("3G");
            sim4.setPhoneNumber("9988776655");
            sim4.setBalance(5.0);
            sim4.setIsActive(false);
            sim4.setExpiryDate("10/10/2024");

            int ref21 = sim4.getSimId();
            System.out.println("Sim ID: " + ref21);
            String ref22 = sim4.getNetworkProvider();
            System.out.println("Network Provider: " + ref22);
            String ref23 = sim4.getSimType();
            System.out.println("Sim Type: " + ref23);
            String ref24 = sim4.getPhoneNumber();
            System.out.println("Phone Number: " + ref24);
            double ref25 = sim4.getBalance();
            System.out.println("Balance: " + ref25);
            boolean ref26 = sim4.getIsActive();
            System.out.println("Is Active: " + ref26);
            String ref27 = sim4.getExpiryDate();
            System.out.println("Expiry Date: " + ref27);
            System.out.println();

            SimCard sim5 = new SimCard();
            sim5.setSimId(5);
            sim5.setNetworkProvider("Jio");
            sim5.setSimType("5G");
            sim5.setPhoneNumber("9988001122");
            sim5.setBalance(200.0);
            sim5.setIsActive(true);
            sim5.setExpiryDate("01/01/2028");

            int ref28 = sim5.getSimId();
            System.out.println("Sim ID: " + ref28);
            String ref29 = sim5.getNetworkProvider();
            System.out.println("Network Provider: " + ref29);
            String ref30 = sim5.getSimType();
            System.out.println("Sim Type: " + ref30);
            String ref31 = sim5.getPhoneNumber();
            System.out.println("Phone Number: " + ref31);
            double ref32 = sim5.getBalance();
            System.out.println("Balance: " + ref32);
            boolean ref33 = sim5.getIsActive();
            System.out.println("Is Active: " + ref33);
            String ref34 = sim5.getExpiryDate();
            System.out.println("Expiry Date: " + ref34);
            System.out.println();
        }

}
