package com.xworkz.inheritance.plant;

public class PlantRunner {

        public static void main(String[] args) {
            Plant plant = new Plant();
            plant.method1();
            plant.method2();
            plant.method3();
            plant.method4();
            plant.method5();

            Flower flower = new Flower();
            flower.sub1();
            flower.sub2();
            flower.sub3();
            flower.sub4();
            flower.sub5();

            Plant plant1 = new Flower();
            plant1.method1();
            plant1.method2();
            plant1.method3();
            plant1.method4();
            plant1.method5();
        }

}
