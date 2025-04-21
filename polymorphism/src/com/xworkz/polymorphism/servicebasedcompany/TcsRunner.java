package com.xworkz.polymorphism.servicebasedcompany;

public class TcsRunner {

        public static void main(String[] args) {
            System.out.println("--- Service Based Company ---");
            ServiceBasedCompany company = new ServiceBasedCompany();
            company.hireEmployees();
            company.provideServices();
            company.manageClients();
            company.generateRevenue();
            company.maintainSupport();

            System.out.println("\n--- Service Based Company as TCS ---");
            ServiceBasedCompany company1 = new Tcs();
            company1.hireEmployees();
            company1.provideServices();
            company1.manageClients();
            company1.generateRevenue();
            company1.maintainSupport();

            System.out.println("\n--- TCS ---");
            Tcs tcs = new Tcs();
            tcs.hireEmployees();
            tcs.provideServices();
            tcs.manageClients();
            tcs.generateRevenue();
            tcs.maintainSupport();
        }
    }


