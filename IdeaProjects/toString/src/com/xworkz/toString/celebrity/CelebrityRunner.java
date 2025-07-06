package com.xworkz.toString.celebrity;
public class CelebrityRunner {
    public static void main(String[] args) {
        Celebrity celebrity = new Celebrity();

        celebrity.setName("Virat Kohli");
        celebrity.setAge(35);
        celebrity.setProfession("Cricketer");
        celebrity.setAwardsWon(10);
        celebrity.setActive(true);
        celebrity.setNationality("Indian");
        celebrity.setNetWorth(140);
        System.out.println(celebrity.toString());
    }
}
