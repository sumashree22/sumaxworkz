package com.xworkz.toString.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Minal J J");
        employee.setEmployeeId(1001);
        employee.setDepartment("Engineering");
        employee.setPosition("Software Developer");
        employee.setSalary(75000);
        employee.setFullTime(true);
        employee.setExperienceYears(3);

        System.out.println(employee.toString());
    }
}

