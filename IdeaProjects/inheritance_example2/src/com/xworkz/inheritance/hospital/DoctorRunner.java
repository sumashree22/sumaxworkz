package com.xworkz.inheritance.hospital;

public class DoctorRunner {
    public static void main(String[] args) {

        HealthcareWorker parent = new HealthcareWorker();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        HealthcareWorker parentRef = new Doctor();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        Doctor child = new Doctor();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
