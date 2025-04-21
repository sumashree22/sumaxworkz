package com.xworkz.polymorphism.Engineer;

public class CivilEngineer  extends  Engineer{
        @Override
        public void design() {
            System.out.println("CivilEngineer: Designing infrastructure projects like buildings, roads, and bridges.");
        }

        @Override
        public void develop() {
            System.out.println("CivilEngineer: Developing plans for construction and ensuring structural integrity.");
        }

        @Override
        public void analyze() {
            System.out.println("CivilEngineer: Analyzing soil, materials, and environmental impact.");
        }

        @Override
        public void test() {
            System.out.println("CivilEngineer: Testing materials like concrete and steel for safety and durability.");
        }

        @Override
        public void manage() {
            System.out.println("CivilEngineer: Managing construction sites and overseeing building projects.");
        }
    }


