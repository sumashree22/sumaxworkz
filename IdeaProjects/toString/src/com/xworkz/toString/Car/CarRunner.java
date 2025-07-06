package com.xworkz.toString.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        car.setBrand("Tesla");
        car.setModel("Model S");
        car.setYear(2023);
        car.setPrice(95.5);
        car.setFuelType("Electric");
        car.setElectric(true);
        car.setMileage(0); // Electric cars don't use km/l

        System.out.println(car.toString());
    }
}

