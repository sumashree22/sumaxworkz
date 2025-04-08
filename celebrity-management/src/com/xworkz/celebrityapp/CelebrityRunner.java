package com.xworkz.celebrityapp;

import com.xworkz.celebrityapp.celebrity.Celebrity;

public class CelebrityRunner {
        public static void main(String[] args) {

            Celebrity celeb1 = new Celebrity();
            celeb1.setName("Shah Rukh Khan");
            celeb1.setAge(58);
            celeb1.setProfession("Actor");
            celeb1.setNationality("Indian");
            celeb1.setNetWorth(770.5);
            celeb1.setIsActive(true);
            celeb1.setDebutYear("1992");

            String ref1 = celeb1.getName();
            System.out.println("Name: " + ref1);
            int ref2 = celeb1.getAge();
            System.out.println("Age: " + ref2);
            String ref3 = celeb1.getProfession();
            System.out.println("Profession: " + ref3);
            String ref4 = celeb1.getNationality();
            System.out.println("Nationality: " + ref4);
            double ref5 = celeb1.getNetWorth();
            System.out.println("Net Worth: $" + ref5 + " million");
            boolean ref6 = celeb1.getIsActive();
            System.out.println("Active: " + ref6);
            String ref7 = celeb1.getDebutYear();
            System.out.println("Debut Year: " + ref7);
            System.out.println();

            Celebrity celeb2 = new Celebrity();
            celeb2.setName("Taylor Swift");
            celeb2.setAge(34);
            celeb2.setProfession("Singer");
            celeb2.setNationality("American");
            celeb2.setNetWorth(1000.0);
            celeb2.setIsActive(true);
            celeb2.setDebutYear("2006");

            String ref8 = celeb2.getName();
            System.out.println("Name: " + ref8);
            int ref9 = celeb2.getAge();
            System.out.println("Age: " + ref9);
            String ref10 = celeb2.getProfession();
            System.out.println("Profession: " + ref10);
            String ref11 = celeb2.getNationality();
            System.out.println("Nationality: " + ref11);
            double ref12 = celeb2.getNetWorth();
            System.out.println("Net Worth: $" + ref12 + " million");
            boolean ref13 = celeb2.getIsActive();
            System.out.println("Active: " + ref13);
            String ref14 = celeb2.getDebutYear();
            System.out.println("Debut Year: " + ref14);
            System.out.println();

            Celebrity celeb3 = new Celebrity();
            celeb3.setName("Emma Watson");
            celeb3.setAge(34);
            celeb3.setProfession("Actress");
            celeb3.setNationality("British");
            celeb3.setNetWorth(85.0);
            celeb3.setIsActive(true);
            celeb3.setDebutYear("2001");

            String ref15 = celeb3.getName();
            System.out.println("Name: " + ref15);
            int ref16 = celeb3.getAge();
            System.out.println("Age: " + ref16);
            String ref17 = celeb3.getProfession();
            System.out.println("Profession: " + ref17);
            String ref18 = celeb3.getNationality();
            System.out.println("Nationality: " + ref18);
            double ref19 = celeb3.getNetWorth();
            System.out.println("Net Worth: $" + ref19 + " million");
            boolean ref20 = celeb3.getIsActive();
            System.out.println("Active: " + ref20);
            String ref21 = celeb3.getDebutYear();
            System.out.println("Debut Year: " + ref21);
            System.out.println();

            Celebrity celeb4 = new Celebrity();
            celeb4.setName("Elon Musk");
            celeb4.setAge(53);
            celeb4.setProfession("Entrepreneur");
            celeb4.setNationality("American");
            celeb4.setNetWorth(250000.0);
            celeb4.setIsActive(true);
            celeb4.setDebutYear("1995");

            String ref22 = celeb4.getName();
            System.out.println("Name: " + ref22);
            int ref23 = celeb4.getAge();
            System.out.println("Age: " + ref23);
            String ref24 = celeb4.getProfession();
            System.out.println("Profession: " + ref24);
            String ref25 = celeb4.getNationality();
            System.out.println("Nationality: " + ref25);
            double ref26 = celeb4.getNetWorth();
            System.out.println("Net Worth: $" + ref26 + " million");
            boolean ref27 = celeb4.getIsActive();
            System.out.println("Active: " + ref27);
            String ref28 = celeb4.getDebutYear();
            System.out.println("Debut Year: " + ref28);
            System.out.println();

            Celebrity celeb5 = new Celebrity();
            celeb5.setName("Sachin Tendulkar");
            celeb5.setAge(51);
            celeb5.setProfession("Cricketer");
            celeb5.setNationality("Indian");
            celeb5.setNetWorth(200.0);
            celeb5.setIsActive(false);
            celeb5.setDebutYear("1989");

            String ref29 = celeb5.getName();
            System.out.println("Name: " + ref29);
            int ref30 = celeb5.getAge();
            System.out.println("Age: " + ref30);
            String ref31 = celeb5.getProfession();
            System.out.println("Profession: " + ref31);
            String ref32 = celeb5.getNationality();
            System.out.println("Nationality: " + ref32);
            double ref33 = celeb5.getNetWorth();
            System.out.println("Net Worth: $" + ref33 + " million");
            boolean ref34 = celeb5.getIsActive();
            System.out.println("Active: " + ref34);
            String ref35 = celeb5.getDebutYear();
            System.out.println("Debut Year: " + ref35);
            System.out.println();
        }

}
