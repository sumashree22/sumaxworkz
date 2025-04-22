package com.xworkz.toString.Vacation;

public class VacationRunner {
    public static void main(String[] args) {
        Vacation vacation = new Vacation();

        vacation.setDestination("Maldives");
        vacation.setDuration(7);
        vacation.setActivities(new String[]{"Snorkeling", "Beach Volleyball", "Spa"});
        vacation.setBudget(100000.00);
        vacation.setFamilyTrip(true);
        vacation.setAccommodationType("Resort");

        System.out.println(vacation.toString());
    }
}

