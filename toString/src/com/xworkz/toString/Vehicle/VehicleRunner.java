package com.xworkz.toString.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setMake("Tesla");
        vehicle.setModel("Model 3");
        vehicle.setYear(2023);
        vehicle.setPrice(59999.99);
        vehicle.setFuelType("Electric");
        vehicle.setMileage(0); // Electric cars don't have mileage in km/l
        vehicle.setElectric(true);

        System.out.println(vehicle.toString());
    }
}

