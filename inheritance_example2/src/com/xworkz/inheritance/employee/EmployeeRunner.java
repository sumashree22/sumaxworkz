package com.xworkz.inheritance.employee;

public class EmployeeRunner {

        public static void main(String[] args) {
            Employee employee = new Employee();
            employee.method1();
            employee.method2();
            employee.method3();
            employee.method4();
            employee.method5();

            Manager manager = new Manager();
            manager.sub1();
            manager.sub2();
            manager.sub3();
            manager.sub4();
            manager.sub5();

            Employee employee1 = new Manager();
            employee1.method1();
            employee1.method2();
            employee1.method3();
            employee1.method4();
            employee1.method5();
        }
}
