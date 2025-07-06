package com.xworkz.toString.Employee;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
    private String name;
    private int employeeId;
    private String department;
    private double salary;
    private boolean isFullTime;
    private String position;
    private int experienceYears;

    @Override
    public String toString() {
        return "Employee Details:\n" +
                "Name = " + this.name + "\n" +
                "Employee ID = " + this.employeeId + "\n" +
                "Department = " + this.department + "\n" +
                "Position = " + this.position + "\n" +
                "Salary = ₹" + this.salary + "\n" +
                "Full Time = " + this.isFullTime + "\n" +
                "Experience = " + this.experienceYears + " years";
    }
}
